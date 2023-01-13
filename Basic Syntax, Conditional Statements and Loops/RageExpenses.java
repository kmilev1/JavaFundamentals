import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsets = 0;
        int mouses = 0;
        int keyboards = 0;
        int displays = 0;
        double expenses = 0;

        headsets = lostGames / 2;
        mouses = lostGames / 3;

        for (int i = 1; i <= lostGames; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                keyboards++;
                if (keyboards % 2 == 0) {
                    displays++;
                }
            }
        }

        expenses = headsets * headsetPrice + mouses * mousePrice + keyboards * keyboardPrice + displays * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
