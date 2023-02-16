import java.util.*;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArr = command.split(" ");
            if (command.startsWith("Shoot")) {
                int index = Integer.parseInt(commandArr[1]);
                int power = Integer.parseInt(commandArr[2]);
                if (index <= list.size()) {
                    list.set(index, list.get(index) - power);
                }
                if (list.get(index) <= 0) {
                    int elementToRemove = list.get(index);
                    int indexToRemove = list.indexOf(elementToRemove);

                    list.remove(indexToRemove); //Collections.singleton...
                }

            } else if (command.startsWith("Add")) {
                int index = Integer.parseInt(commandArr[1]);
                int value = Integer.parseInt(commandArr[2]);

                if (index <= list.size()) {
                    list.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.startsWith("Strike")) {
                int index = Integer.parseInt(commandArr[1]);
                int radius = Integer.parseInt(commandArr[2]);

                if ((index + radius <= list.size()) && (index - radius >= 0)) {
                list.subList(index - radius, index + radius + 1).clear();
                } else {
                    System.out.println("Strike missed!");
                }
            }
            command = scanner.nextLine();
        }
        String output = list.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "");
        output = output.replaceAll("\\s+", "|");

        System.out.println(output);
    }
}
