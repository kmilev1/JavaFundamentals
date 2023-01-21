import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[count];
        String print = "";

        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            print += numbers[i] + " ";
        }
        System.out.println(print);
    }
}
