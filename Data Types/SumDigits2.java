import java.util.Scanner;

public class SumDigits2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = (int) String.valueOf(number).length();
        int sum = 0;

        for (int i = 0; i < times; i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
