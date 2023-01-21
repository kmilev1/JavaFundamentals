import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte iterations = Byte.parseByte(scanner.nextLine());
        short sum = 0;

        for (int i = 0; i < iterations; i++) {
            char letter = scanner.nextLine().charAt(0);
            sum += (int) letter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
