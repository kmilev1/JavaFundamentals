import java.util.Scanner;

public class BackIn30Minutes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int newTime = hour * 60 + min + 30;

        int newHour = newTime / 60;
        int newMin = newTime % 60;

        if (newHour > 23) {
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, newMin);
    }
}
