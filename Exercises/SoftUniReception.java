import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int efficiencyFirst = Integer.parseInt(scanner.nextLine());
        int efficiencySecond = Integer.parseInt(scanner.nextLine());
        int efficiencyThird = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = efficiencyFirst + efficiencySecond + efficiencyThird;

        double timeNeeded = Math.ceil(count * 1.0 / studentsPerHour);

        for (int i = 1; i <= timeNeeded; i++) {
            if (i % 4 == 0) {
                timeNeeded++;
            }
        }

        System.out.printf("Time needed: %.0fh.", timeNeeded);


    }
}
