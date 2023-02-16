import java.util.Scanner;

public class BlackFlag1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlundger = 0;

        for (int i = 1; i <= days; i++) {
            totalPlundger += dailyPlunder;

            if (i % 3 == 0) {
                totalPlundger += dailyPlunder * 0.5;
            }
            if (i % 5 == 0) {
                totalPlundger *= .7;
            }
        }

        if (totalPlundger >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlundger);
        } else {
            double percentage = totalPlundger / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
