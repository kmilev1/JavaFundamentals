import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            if (String.valueOf(command.charAt(0)).equals("s")) {
                for (int i = 0; i < array.length; i++) {
                    String[] index = command.split(" ");
                    int keepFirstElement = array[Integer.parseInt(index[1])];
                    int keepSecondElement = array[Integer.parseInt(index[2])];
                    array[Integer.parseInt(index[1])] = keepSecondElement;
                    array[Integer.parseInt(index[2])] = keepFirstElement;
                    break;
                }
            } else if (String.valueOf(command.charAt(0)).equals("m")) {
                String[] index1 = command.split(" ");
                int keepFirstElement = array[Integer.parseInt(index1[1])];
                int keepSecondElement = array[Integer.parseInt(index1[2])];
                array[Integer.parseInt(index1[1])] = keepSecondElement * keepFirstElement;

            } else if (String.valueOf(command.charAt(0)).equals("d")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;
                }
            }
        }
        String print = "";
        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 == i) {
                print += array[i];
            } else {
                print += array[i] + ", ";
            }
        }
        System.out.println(print);
    }
}
