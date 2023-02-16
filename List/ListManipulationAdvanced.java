import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] arrCommand = command.split(" ");
            if (command.startsWith("Contains")) {
                int lookupValue = Integer.parseInt(arrCommand[1]);
                boolean isFound = false;
                if (list.contains(lookupValue)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
//                for (Integer number : list) {
//                    if (lookupValue == number) {
//                        isFound = true;
//                        break;
//                    }
//                }
//                if (isFound) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No such number");
//                }
            } else if (command.equals("Print even")) {
                String print = "";
                for (Integer number : list) {
                    if (number % 2 == 0) {
                        print += number + " ";
                    }
                }
                System.out.println(print);
            } else if (command.equals("Print odd")) {
                String print = "";
                for (Integer number : list) {
                    if (number % 2 == 1) {
                        print += number + " ";
                    }
                }
                System.out.println(print);
            } else if (command.equals("Get sum")) {
                int sum = 0;
                for (Integer number : list) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (command.startsWith("Filter")) {
                String print = "";
                String condition = arrCommand[1];
                int referenceNumber = Integer.parseInt(arrCommand[2]);

                printFilteredNumbers(list, condition, referenceNumber);
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }

    public static void printFilteredNumbers(List<Integer> list, String condition, int referenceNumber) {
        switch (condition) {
            case "<":
                for (int number : list) {
                    if (number < referenceNumber) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">":
                for (int number : list) {
                    if (number > referenceNumber) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">=":
                for (int number : list) {
                    if (number >= referenceNumber) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case "<=":
                for (int number : list) {
                    if (number <= referenceNumber) {
                        System.out.print(number + " ");
                    }
                }
                break;
        }
    }
}
