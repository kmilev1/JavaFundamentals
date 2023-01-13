import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String print = "";

        if (input % 10 == 0) {
            print = "The number is divisible by 10";
        } else if (input % 7 == 0) {
            print = "The number is divisible by 7";
        } else if (input % 6 == 0) {
            print = "The number is divisible by 6";
        } else if (input % 3 == 0) {
            print = "The number is divisible by 3";
        } else if (input % 2 == 0) {
            print = "The number is divisible by 2";
        } else {
            print = "Not divisible";
        }
        System.out.println(print);
    }
}
