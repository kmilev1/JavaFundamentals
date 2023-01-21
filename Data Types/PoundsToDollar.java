import java.util.Scanner;

public class PoundsToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        double rateGBPUSD = 1.36;
        double result = rateGBPUSD * dollars;
        System.out.printf("%.3f", result);
    }
}
