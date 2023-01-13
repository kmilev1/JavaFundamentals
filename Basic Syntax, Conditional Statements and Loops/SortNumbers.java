import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        Integer [] arr = {n1, n2, n3};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length;  i++) {
            System.out.println(arr[i]);
        }

    }
}
