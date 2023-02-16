import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.startsWith("Add")) {
                int number = Integer.parseInt(command.split("\\s+")[1]);
                list.add(number);

            } else if (command.startsWith("Insert")) {
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (index > list.size() || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    int number = Integer.parseInt(command.split("\\s+")[1]);
                    list.add(index, number);
                }

            } else if (command.startsWith("Remove")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if (index > list.size() || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    list.remove(index);
                }

            } else if (command.contains("left")) {
                int times = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < times; i++) {
                    list.add(list.size(), list.get(0));
                    list.remove(list.get(0));
                }

            } else if (command.contains("right")) {
                int times = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < times; i++) {
                    list.add(0, list.get(list.size()-1));
                    list.remove(list.size()-1);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
