import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int currentEnergy = initialEnergy;
        int distance = 0;
        int wonCounter = 0;

        while (true) {
            if (command.equals("End of battle")) {
                System.out.printf("Won battles: %d. Energy left: %d", wonCounter, currentEnergy);
                break;
            }

            distance = Integer.parseInt(command);

            if (currentEnergy - distance >= 0) {
                wonCounter++;
                currentEnergy -= distance;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonCounter, currentEnergy);
                break;
            }
            if (wonCounter % 3 == 0) {
                currentEnergy += wonCounter;
            }

            command = scanner.nextLine();
        }
    }
}
