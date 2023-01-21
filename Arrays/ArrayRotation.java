import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countRotations; i++) {
            int current = array[0]; //51 dafault: 51 47 32 61 21
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1) {
                    array[array.length - 1] = current;
                } else {
                    array[j] = array[j + 1]; // 47 32 61 21 51
                }
            }
        }
        String print = "";
        for (int i = 0; i < array.length; i++) {
            print += array[i] + " ";
        }
        System.out.println(print);
    }
}
