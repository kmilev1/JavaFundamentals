import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] arrCommand = command.split(" ");
            if (arrCommand[0].equals("Add")) {
                list.add(Integer.valueOf(arrCommand[1]));
            } else if (arrCommand[0].equals("Remove")) {
                list.remove(Integer.valueOf(arrCommand[1]));
            } else if (arrCommand[0].equals("RemoveAt")) {
                int index = Integer.parseInt(arrCommand[1]);
                list.remove(index);
            } else if (arrCommand[0].equals("Insert")) {
                int index = Integer.parseInt(arrCommand[2]);
                int number = Integer.parseInt(arrCommand[1]);
                list.add(index, number);
            }


            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

}
