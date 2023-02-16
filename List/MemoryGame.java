import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int movesCounter = 0;

        while (!command.equals("end")) {
            int first = Integer.parseInt(command.split(" ")[0]);
            int second = Integer.parseInt(command.split(" ")[1]);
            movesCounter++;
            if ((first == second) || (first < 0 || first >= list.size() || second < 0 || second >= list.size())) {
                String elementToAdd = "-" + movesCounter + "a";
                list.add(list.size() / 2, elementToAdd);
                list.add(list.size() / 2, elementToAdd);

                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (list.get(first).equals(list.get(second))) {
                    int max = Math.max(first, second);
                    int min = Math.min(first, second);
                    String element = list.get(first);

                    list.remove(max);
                    list.remove(min);

                    System.out.printf("Congrats! You have found matching elements - %s!%n", element);
                } else if (!list.get(first).equals(list.get(second))) {
                    System.out.println("Try again!");
                }

            }

            if (list.isEmpty()) {
                System.out.println("You have won in " + movesCounter + " turns!");
                break;
            }

            command = scanner.nextLine();
        }
        if (list.size() > 0) {
            System.out.println("Sorry you lose :(");
            String output = String.join(" ", list);
            System.out.println(output);
        }
    }
}
