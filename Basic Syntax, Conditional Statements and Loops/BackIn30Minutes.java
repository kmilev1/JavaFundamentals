import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int newHour = 0;
        int newMinutes = min + 30;

        if (newMinutes >= 60) {
            newHour = hours + 1;
            newMinutes -= 60;
            if (newHour > 23) {
                newHour -= 24;
            }
        } else {
            newHour = hours;
        }

        if (newMinutes < 10) {
            System.out.printf("%d:0%d", newHour, newMinutes);
        } else {
            System.out.printf("%d:%d", newHour, newMinutes);
        }
    }
}
