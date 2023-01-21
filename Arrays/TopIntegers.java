import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = 0;
        String print = "";

        for (int i = 0; i < array.length; i++) { // index на самия елемент в цикъла
            boolean isBigger = false;
            for (int j = i + 1; j <= array.length - 1; j++) { // сравнявам 1 елемент напред с базисния елемент
                if (array[i] > array[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                print += array[i] + " ";
            }
            if (array.length - 1 == i) {
                print += array[i];
            }
        }
        System.out.println(print);
    }
}
