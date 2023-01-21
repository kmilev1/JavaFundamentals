import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int symbolsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < symbolsCount; i++) {
             char currentSymbol = scanner.nextLine().charAt(0);
             int asciiNumber = (char) currentSymbol;
             int newNumber = key + asciiNumber;
            System.out.print((char) newNumber);
        }
    }
}
