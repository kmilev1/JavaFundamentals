import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int current = 1;
        int counter = 0;
        int sum = 0;

        while (true) {
            if (counter == count) {
                System.out.println("Sum: " + sum);
                break;
            }
            if (current % 2 == 1) {
                System.out.println(current);
                sum += current;
                counter++;
            }
            current++;
        }
    }
}
