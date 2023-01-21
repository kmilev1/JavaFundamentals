import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String array1 = "";
        String array2 = "";

        for (int i = 0; i < count; i++) {
            int[] currentArray = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < 2; j++) {
                if (i % 2 == 0) {
                    array1 += currentArray[j] + " ";
                    array2 += currentArray[j + 1] + " ";
                    break;
                } else {
                    array1 += currentArray[j + 1] + " ";
                    array2 += currentArray[j] + " ";
                    break;
                }
            }
        }
        System.out.println(array1);
        System.out.println(array2);
    }
}
