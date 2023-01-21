import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[countWagons];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            arr[i] = people;
            sum += people;
            System.out.print(arr[i] + " ");
        }
        System.out.printf("%n%d", sum);
    }
}
