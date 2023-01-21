import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        int sumDigits = 0;

        for (int i = 1; i <= number; i++) {
            String numToText = String.valueOf(i);
            digit = i;
            for (int j = 0; j < numToText.length(); j++) {
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
