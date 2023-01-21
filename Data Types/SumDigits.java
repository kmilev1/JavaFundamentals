import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        byte sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Byte.parseByte(String.valueOf(number.charAt(i)));
        }
        System.out.println(sum);
    }
}
