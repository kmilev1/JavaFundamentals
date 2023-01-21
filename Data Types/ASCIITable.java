import java.util.Scanner;

public class ASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte start = Byte.parseByte(scanner.nextLine());
        byte end = Byte.parseByte(scanner.nextLine());
        String print = "";

        for (int i = start; i <= end; i++) {
            char printMe = (char) i;
            print += printMe + " ";

        }
        System.out.println(print);
    }
}
