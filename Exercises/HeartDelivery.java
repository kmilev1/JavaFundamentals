import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split("@"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int initialIndex = 0;
        int currentIndex = 0;
        int countFailed = 0;

        while (!command.equals("Love!")) {
            String[] commandArr = command.split(" ");
            if (command.startsWith("Jump")) {
                int currentJumpStep = Integer.parseInt(commandArr[1]);
                currentIndex = initialIndex + currentJumpStep;

                if (currentIndex > list.size()-1) {
                    currentIndex = 0;
                }

                if (Integer.parseInt(list.get(currentIndex)) == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", currentIndex);

                    if (initialIndex + currentJumpStep <= list.size()) {
                        initialIndex = currentIndex;
                    } else {
                        initialIndex = 0;
                    }

                } else {
                    list.set(currentIndex, String.valueOf(Integer.parseInt(list.get(currentIndex)) - 2));
                    if (initialIndex + currentJumpStep <= list.size()) {
                        initialIndex = currentIndex;
                    } else {
                        initialIndex = 0;
                    }
                    if (Integer.parseInt(list.get(currentIndex)) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) != 0) {
                countFailed++;
            }
        }
        if (countFailed > 0) {
            System.out.printf("Cupid has failed %d places.", countFailed);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}

