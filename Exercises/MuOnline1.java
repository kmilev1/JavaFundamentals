import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int currentHealth = 100;
        int currentBitcoins = 0;
        int bestRoom = 0;
        String command = "";

        for (int i = 0; i < list.size(); i++) {
            command = list.get(i);
            bestRoom++;

            if (command.startsWith("potion")) {
                int healedNumber = Integer.parseInt(command.split(" ")[1]);
                int realHealedAmount = 0;
                if (currentHealth + healedNumber <= 100) {
                    realHealedAmount = healedNumber;
                    currentHealth += realHealedAmount;
                } else {
                    realHealedAmount = 100 - currentHealth;
                    currentHealth += realHealedAmount;
                }
                System.out.printf("You healed for %d hp.%n", realHealedAmount);
                System.out.printf("Current health: %d hp.%n", currentHealth);

            } else if (command.startsWith("chest")) {
                int bitcoinsFound = Integer.parseInt(command.split(" ")[1]);
                currentBitcoins += bitcoinsFound;
                System.out.printf("You found %d bitcoins.%n", bitcoinsFound);

            } else {
                String monster = command.split(" ")[0];
                int monsterAttack = Integer.parseInt(command.split(" ")[1]);
                currentHealth -= monsterAttack;
                if (currentHealth > 0) {
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d", bestRoom);
                    break;
                }
            } // monster
        }
        if (currentHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", currentBitcoins);
            System.out.printf("Health: %d%n", currentHealth);
        }
    }
}
