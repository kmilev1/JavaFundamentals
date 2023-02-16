import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            if (commandArr[0].equals("Add")) {
                int newWagon = Integer.parseInt(commandArr[1]);
                wagons.add(newWagon);
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    if (Integer.parseInt(command) + wagons.get(i) <= capacity) {
                        wagons.set(i, (wagons.get(i) + Integer.parseInt(command)));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
