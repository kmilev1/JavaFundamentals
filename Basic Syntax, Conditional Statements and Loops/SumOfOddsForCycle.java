import java.util.Scanner;

public class SumOfOddsForCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;

        for (int i = 1; i <= count; i++) {
                System.out.println(counter);
                sum += counter;
                counter += 2;
            }
        System.out.println("Sum: " + sum);
    }
}
