import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double total = 0.0;

        if (type.equals("Students")) {
            switch (day) {
                case "Friday": total = countOfPeople * 8.45; break;
                case "Saturday": total = countOfPeople * 9.8; break;
                case "Sunday": total = countOfPeople * 10.46; break;
            }
        } else if (type.equals("Business")) {
            switch (day) {
                case "Friday": total = countOfPeople * 10.9; break;
                case "Saturday": total = countOfPeople * 15.6; break;
                case "Sunday": total = countOfPeople * 16; break;
            };
        } else if (type.equals("Regular")) {
            switch (day) {
                case "Friday": total = countOfPeople * 15; break;
                case "Saturday": total = countOfPeople * 20; break;
                case "Sunday": total = countOfPeople * 22.5; break;
            }
        }

        if (type.equals("Students") && countOfPeople >= 30) {
            total *= .85;
        } else if (type.equals("Business") && countOfPeople >= 100) {
            switch (day) {
                case "Friday": total -= 10 * 10.9; break;
                case "Saturday": total -= 10 * 15.6; break;
                case "Sunday": total -= 10 * 16; break;
            }
        } else if (type.equals("Regular") && (countOfPeople >= 10 && countOfPeople <=20)) {
            total *= .95;
        }
        System.out.printf("Total price: %.2f", total);
    }
}
