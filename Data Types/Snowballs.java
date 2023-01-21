import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        long snowballValue = 0;

        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        long maxValue = Long.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());


            snowballValue = snowballSnow / snowballTime;
            snowballValue = (long) Math.pow(snowballValue, snowballQuality);


            if (snowballValue > maxValue) {
                maxValue = snowballValue;

                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", maxSnow, maxTime, maxValue, maxQuality);
    }
}
