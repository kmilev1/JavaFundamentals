import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String sequence = "";

        for (int i = text.length(); i >= 1; i--) {
            String symbol = String.valueOf(text.charAt(i - 1));
            sequence += symbol;
        }
        System.out.println(sequence);
    }
}
