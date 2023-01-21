import java.util.Scanner;

public class Elevator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) countPeople / capacity);

        System.out.println(courses);
    }
}
