import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = "";
        String loginAttempt = "";
        int counter = 0;

        for (int i = user.length()-1; i >= 0; i--) {
            pass += user.charAt(i);
        }

        while (true) {
            loginAttempt = scanner.nextLine();

            if (loginAttempt.equals(pass)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                counter++;

                if (counter > 3) {
                    System.out.printf("User %s blocked!", user);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
