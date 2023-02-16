import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double total = 0;
        boolean isSpecial = false;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("special")) {
                isSpecial = true;
                break;
            } else if (input.equals("regular")) {
                break;
            }
            double partsPrice = Double.parseDouble(input);
            if (partsPrice < 0) {
                System.out.println("Invalid price!");
            } else if (partsPrice == 0) {
                System.out.println("Invalid order!");
            } else {
                sum += partsPrice;
            }
        }

        double tax = sum * .2;

        if (isSpecial) {
            total = (sum + tax) * .9;
        } else {
            total = sum + tax;
        }

        if (sum > 0) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", total);
        } else {
            System.out.println("Invalid order!");
        }
    }
}
