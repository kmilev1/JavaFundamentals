import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] condensed = new int[arr.length-1];

        int counter = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                break;
            }
            if (i == arr.length-1) {
                int[] condensedNew = new int[condensed.length-1];
                i = -1;
                arr = condensed;
                condensed = condensedNew;
            } else {
                condensed[i] = arr[i] + arr[i+1];
            }
        }
        System.out.println(arr[0]);
    }
}
