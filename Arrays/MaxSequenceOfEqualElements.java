import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 1;
        int max = 0;
        int digit = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i - 1]) {
                counter++;

                if (counter > max) {
                    max = counter;
                    digit = array[i];
                }
            } else
                counter = 1;
        }

        for (int i = 0; i < max; i++) { // броим колко пъти се повтаря дадена цифра; тук я отпечатваме
            System.out.print(digit + " ");
        }
    }
}