import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = Double.MIN_VALUE;
        double totalBonus = 0;
        int lectureAttendance = 0;

        for (int i = 0; i < students; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            totalBonus = studentAttendance * 1.0 / lectures * (5 + additionalBonus);

            if (maxBonus <totalBonus) {
                maxBonus = totalBonus;
                lectureAttendance = studentAttendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", lectureAttendance);
    }
}
