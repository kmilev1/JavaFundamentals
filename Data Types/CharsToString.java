import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charOne = scanner.nextLine().charAt(0);
        char charTwo = scanner.nextLine().charAt(0);
        char charThree = scanner.nextLine().charAt(0);

        String print = String.format("%s %s %s", charThree, charTwo, charOne);
        System.out.println(print);
    }

    public static class FloatingEquality {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());

            double eps = 0.000001;

            double diff = Math.abs(n1-n2);

            if (diff < eps) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
