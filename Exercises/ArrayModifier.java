import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            if (command.startsWith("swap")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                int keepFirstElement = list.get(index1);
                int keepSecondElement = list.get(index2);

                list.set(index1, keepSecondElement);
                list.set(index2, keepFirstElement);
            } else if (command.startsWith("multiply")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                list.set(index1, list.get(index1) * list.get(index2));
            } else if (command.equals("decrease")) {
                for (int i = 0; i < list.size(); i++) {
                    list.set(i, list.get(i) - 1);
                }
            }
            command = scanner.nextLine();
        }
        String output = list.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll("", " ");
        System.out.print(output);
    }
}
