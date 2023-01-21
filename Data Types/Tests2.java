import java.util.Scanner;

public class Tests2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yieldInit = Integer.parseInt(scanner.nextLine());
        int yieldLimit = yieldInit;

        int dayCounter = 0;
        int total = 0;

        while (yieldLimit >= 100) {
            dayCounter++;
            yieldInit = yieldLimit - 26;
            yieldLimit -= 10;

            total += yieldInit;

            if (yieldLimit < 100) {
                total -= 26;
            }
        }
        System.out.println(dayCounter);
        System.out.println(total);
    }
}
