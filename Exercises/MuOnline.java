import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;

        int roomCounter = 0;
        boolean isKilled = false;

        for (int i = 0; i < list.size(); i++) {
            String command = list.get(i);
            String[] commandArr = command.split(" ");
            roomCounter++;

            if (commandArr[0].equals("potion")) {
                int extraHealth = Integer.parseInt(commandArr[1]);
                if (health + extraHealth < 100) {
                    health += extraHealth;
                    System.out.printf("You healed for %d hp.%n", extraHealth);
                } else if (health < 100 && health + extraHealth > 100) {
                    int healedAdjustment = 100 - health;
                    health += healedAdjustment;
                    System.out.printf("You healed for %d hp.%n", healedAdjustment);
                }
                System.out.printf("Current health: %d hp.%n", health);

            } else if (commandArr[0].equals("chest")) {
                int chestReceived = Integer.parseInt(commandArr[1]);
                bitcoins += chestReceived;
                System.out.printf("You found %d bitcoins.%n", chestReceived);

            } else {
                String monster = commandArr[0];
                int monstersAttack = Integer.parseInt(commandArr[1]);
                health -= monstersAttack;

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d%n", roomCounter);
                    isKilled = true;
                    break;
                }
            }
        }
        if (!isKilled) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);

        }
    }
}
