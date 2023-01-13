import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int currentResult = 0;
        int result = 1;
        int sum = 0;

        // intToChar: char c='1'; int a=Character.getNumericValue(c);
        // intToString: int a = 1234; String str1 = Integer.toString(a);
        // stringToInt: String s="200"; int i=Integer.parseInt(s);

        for (int i = 0; i < input.length(); i++) {
            int value = Character.getNumericValue(input.charAt(i));
            currentResult = value;
            if (value == 0 || value == 1) {
                result = 1;
            }
            for (int j = value-1; j > 0; j--) {
                result = currentResult * j;

                currentResult = result;
            // System.out.println(result);

            }
            sum += result;

        }
        if (sum == Integer.parseInt(input)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

