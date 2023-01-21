import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumLeft = 0;
        int sumRight = 0;
        String output = "";
        boolean isSuccess = false;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                sumLeft = 0; // ако се намирам на 0-вия елемент, не търся елементи отляво на него
            }  else {
                sumLeft += array[i - 1]; // на всяка итерация добавям предходния елемент от масива, този отляво
            }
            for (int j = i + 1; j <= array.length - 1; j++) {
                sumRight += array[j]; // остават ми Х итерации до края -> за всяка една от тях прочитам числото зад индекса и го добавям
            }

            if (sumLeft == sumRight) { // проверка имаме ли съвпадение
                output = String.valueOf(i);
                isSuccess = true;
                break;
            }
            sumRight = 0; // занулявам дясната сума
        }
        if (isSuccess) {
            System.out.println(output);
        } else {
            System.out.println("no");
        }
    }
}
