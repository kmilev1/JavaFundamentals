import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int netProduction = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int productionLeft = 0;
        int fieldCapacity = netProduction;

        while (true) {
            if (netProduction >= 100) {
                days++;
                netProduction -= 26; //111 - > 85
                productionLeft += netProduction;

                fieldCapacity -= 10; //101
                netProduction = fieldCapacity; //101
            } else {
                if (productionLeft >= 26) {
                    productionLeft -= 26;
                }
                break;
            }

        }
        System.out.println(days);
        System.out.println(productionLeft);
    }
}
