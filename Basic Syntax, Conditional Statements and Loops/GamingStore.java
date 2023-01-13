import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double spentMoney = 0;
        boolean isMoney = true;

        while (true) {
            String game = scanner.nextLine();
            if (game.equals("Game Time")) {
                break;
            } else if (game.equals("OutFall 4")) {
                if (balance - 39.99 >= 0) {
                    balance -= 39.99;
                    spentMoney += 39.99;
                    System.out.println("Bought OutFall 4");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("CS: OG")) {
                if (balance - 15.99 >= 0) {
                    balance -= 15.99;
                    spentMoney += 15.99;
                    System.out.println("Bought CS: OG");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Zplinter Zell")) {
                if (balance - 19.99 >= 0) {
                    balance -= 19.99;
                    spentMoney += 19.99;
                    System.out.println("Bought Zplinter Zell");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("Honored 2")) {
                if (balance - 59.99 >= 0) {
                    balance -= 59.99;
                    spentMoney += 59.99;
                    System.out.println("Bought Honored 2");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch")) {
                if (balance - 29.99 >= 0) {
                    balance -= 29.99;
                    spentMoney += 29.99;
                    System.out.println("Bought RoverWatch");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                if (balance - 39.99 >= 0) {
                    balance -= 39.99;
                    spentMoney += 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                isMoney = false;
                break;
            }
        }
        if (isMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, balance);
        }
    }
}
