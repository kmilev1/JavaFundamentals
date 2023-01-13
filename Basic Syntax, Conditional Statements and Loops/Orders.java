import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double current = 0;
        double total = 0;
        int counter = 0;

        while (ordersCount > counter) {
            counter++;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            current = (days * capsulesCount) * pricePerCapsule;
            total += current;

            System.out.printf("The price for the coffee is: $%.2f%n", current);

        }
        System.out.printf("Total: $%.2f", total);
    }
}
