import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;

        for (int i = 0; i < n; i++) {
            long[] numbers = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            if (numbers[0] > numbers[1]) {
                long positive = Math.abs(numbers[0]);
                for (int j = 0; j < String.format(String.valueOf(Math.abs(numbers[0]))).length(); j++) {
                    sumDigits += Character.getNumericValue(String.valueOf(positive).charAt(j));
                }
                System.out.println(sumDigits);
            } else {
                long positive = Math.abs(numbers[1]);
                for (int j = 0; j < String.format(String.valueOf(Math.abs(numbers[1]))).length(); j++) {
                    sumDigits += Character.getNumericValue(String.valueOf(positive).charAt(j));
                }
                System.out.println(sumDigits);
            }
            sumDigits = 0;

        }
    }
}
