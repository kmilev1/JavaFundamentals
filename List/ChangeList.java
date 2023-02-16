import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("Delete")) {
                int element = Integer.parseInt(commandArray[1]);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == element) {
                        list.removeAll(Collections.singleton(element));
                    }
                }
            } else if (commandArray[0].equals("Insert")) {
                int element = Integer.parseInt(commandArray[1]);
                int index = Integer.parseInt(commandArray[2]);
                list.add(index, element);
            }


            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));

    }
}
