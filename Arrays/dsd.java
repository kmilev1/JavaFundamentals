import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class dsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String[] index = command.split(" ");


        System.out.println(index[2]);
    }
}
