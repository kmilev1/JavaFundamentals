import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int countShootTargets = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index <= targets.length) {
                int initialTarget = 0;
                boolean isShoot = false;
                for (int i = 0; i < targets.length; i++) {
                    if (i == index) {
                        initialTarget = targets[i];
                        targets[i] = -1;
                        isShoot = true;
                        break;
                    }
                }
                if (isShoot) {
                    countShootTargets++;
                    for (int j = 0; j < targets.length; j++) {
                        int currentTarget = targets[j];

                        if (currentTarget > initialTarget && currentTarget != -1) {
                            targets[j] = currentTarget - initialTarget;
                        } else if (currentTarget <= initialTarget && currentTarget != -1) {
                            targets[j] = currentTarget + initialTarget;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShootTargets);
        for (int i = 0; i < targets.length; i++) {
            String output = targets[i] + " ";
            System.out.print(output);
        }
    }
}
