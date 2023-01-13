import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSabres = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double calc = 0;
        int freeBelts = countStudents / 6;

        calc = (Math.ceil(countStudents * 1.1) * priceSabres) + (priceRobes * countStudents) + (priceBelts * (countStudents - freeBelts));

        if (calc <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", calc);
        } else {
            double diff = Math.abs(calc - money);
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
