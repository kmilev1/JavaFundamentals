import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            if (command.startsWith("Collect")) {
                String item = command.split(" - ")[1];
                if (!list.contains(item)) {
                    list.add(item);
                }
            } else if (command.startsWith("Drop")) {
                String item = command.split(" - ")[1];
                list.remove(item);
            } else if (command.startsWith("Combine Items")) {
                String item = command.split(" - ")[1];
                String oldItem = item.split(":")[0];
                String newItem = item.split(":")[1];

                if (list.contains(oldItem)) {
                    int getOldItemIndex = list.indexOf(oldItem);
                    list.add(getOldItemIndex+1, newItem);
                }
            } else if (command.startsWith("Renew")) {
                String item = command.split(" - ")[1];

                if (list.contains(item)) {
                    int getItemIndex = list.indexOf(item);
                    list.add(item);
                    list.remove(getItemIndex);
                }
            }
            command = scanner.nextLine();
        }
        String output = Arrays.asList(list).toString()
                .replace("[", "")
                .replace("]", "");
        System.out.println(output);
    }
}
