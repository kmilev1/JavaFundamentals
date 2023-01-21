import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        int sumDigits = 0;
        int temp = 0;

        for (int i = 1; i <= number; i++) {
            digit = i;
            while (i > 0) {
                sumDigits += i % 10;
                i = i / 10;
            }

            i = digit;
            if ((sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11)) {
                System.out.println(i + " -> True");
                sumDigits = 0;

            } else {
                System.out.println(i + " -> False");
                sumDigits = 0;
            }
        }
    }
}
