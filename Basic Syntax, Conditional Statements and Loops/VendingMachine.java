import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;

        while (true) {
            if (command.equals("Start")) {
                while (true) {
                    command = scanner.nextLine();
                    if (command.equals("End")) {
                        break;
                    } else {
                        if (command.equals("Coke")) {
                            if (sum >= 1) {
                                System.out.println("Purchased " + command);
                                sum -= 1;
                            } else {
                                System.out.println("Sorry, not enough money");
                            }
                        } else if (command.equals("Nuts")) {
                            if (sum >= 2) {
                                System.out.println("Purchased " + command);
                                sum -= 2;
                            } else {
                                System.out.println("Sorry, not enough money");
                            }
                        } else if (command.equals("Water")) {
                            if (sum >= .7) {
                                System.out.println("Purchased " + command);
                                sum -= .7;
                            } else {
                                System.out.println("Sorry, not enough money");
                            }
                        } else if (command.equals("Crisps")) {
                            if (sum >= 1.5) {
                                System.out.println("Purchased " + command);
                                sum -= 1.5;
                            } else {
                                System.out.println("Sorry, not enough money");
                            }
                        } else if (command.equals("Soda")) {
                            if (sum >= .8) {
                                System.out.println("Purchased " + command);
                                sum -= .8;
                            } else {
                                System.out.println("Sorry, not enough money");
                            }
                        } else {
                            System.out.println("Invalid product");
                        }
                    }
                }
                break;
            } else {
                double coin = Double.parseDouble(command);
                if (coin == 1 || coin == 2 || coin == 0.5 || coin == 0.2 || coin == 0.1) {
                    sum += coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coin);
                }
                command = scanner.nextLine();

            }

        }
        System.out.printf("Change: %.2f", sum);
    }
}
