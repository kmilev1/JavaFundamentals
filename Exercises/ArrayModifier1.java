import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.startsWith("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = list.get(index1);
                int element2 = list.get(index2);

                list.set(index1, element2);
                list.set(index2, element1);

            } else if (command.startsWith("multiply ")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int calc = list.get(index1) * list.get(index2);

                list.set(index1, calc);

            } else if (command.equals("decrease")) {
                for (int i = 0; i < list.size(); i++) {
                    list.set(i, list.get(i) - 1);
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
