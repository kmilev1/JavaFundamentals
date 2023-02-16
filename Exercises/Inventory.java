import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {

            if (command.startsWith("Collect")) {
                String[] commandArr = command.split(" - ");
                String element = commandArr[1];
                if (!list.contains(element)) {
                    list.add(element);
                }
            } else if (command.startsWith("Drop")) {
                String[] commandArr = command.split(" - ");
                String element = commandArr[1];
                if (list.contains(element)) {
                    list.remove(element);
                }
            } else if (command.startsWith("Combine")) {
                command = command.replace(":", " - ");
                String[] commandArr = command.split(" - ");

                String oldItem = commandArr[1];
                String newItem = commandArr[2];

                if (list.contains(oldItem)) {
                    int index = list.indexOf(oldItem);
                    list.add(index+1, newItem);
                }
            } else if (command.startsWith("Renew")) {
                String[] commandArr = command.split(" - ");
                String renewElement = commandArr[1];
                if (list.contains(renewElement)) {
                    list.remove(renewElement);
                    list.add(renewElement);
                }
            }
            command = scanner.nextLine();
        }
        String output = list.toString()
                .replace("[", "")
                .replace("]", "");

        System.out.print(output);
    }
}
