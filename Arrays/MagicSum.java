import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int baseNumber = Integer.parseInt(scanner.nextLine());

        String print = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <= array.length-1; j++) {
                if (array[i] + array[j] == baseNumber) {
                    print = array[i] + " " + array[j];
                    System.out.println(print);
//                    break;
                }
            }
        }
    }
}
