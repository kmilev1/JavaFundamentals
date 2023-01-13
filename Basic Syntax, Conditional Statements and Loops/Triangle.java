import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String triangle = "";

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                triangle += String.valueOf(i) + " ";
            }
            System.out.println(triangle);
            triangle = "";
        }
    }
}
