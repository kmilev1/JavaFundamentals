import java.util.Scanner;

public class StrongN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int value = 1;
        int cumul = 0;

        for (int i = 0; i < num.length(); i++) {
            int currentDigit = Character.getNumericValue(num.charAt(i));

            for (int j = 1; j <= currentDigit - 1; j++) {
                value = value * (j + 1);
            }

            cumul += value;
            value = 1;
        }
        if (Integer.parseInt(num) == cumul) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}