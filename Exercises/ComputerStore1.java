import java.util.Scanner;

public class ComputerStore1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;

        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0) {
                System.out.println("Invalid price");
            } else if (price == 0) {
                System.out.println("Invalid order");
            } else {
                sum += price;
            }
            command = scanner.nextLine();
        }

        if (sum == 0) {
            System.out.println("Invalid order");
        } else {
            double taxes = sum * .2;
            double total = sum + taxes;

            if (command.equals("special")) {
                total *= .9;
            }

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }
}
