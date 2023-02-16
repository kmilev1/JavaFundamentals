import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateList = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warshipList = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealthPerSection = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        boolean isStalemate = true;

        while (!command.equals("Retire")) {
            if (command.startsWith("Fire")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int damage = Integer.parseInt(command.split(" ")[2]);

                if (isValidIndex(warshipList, index) && damage >= 1 && damage <= 1000) {
                    int result = warshipList.get(index) - damage;
                    warshipList.set(index, result);

                    if (result <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isStalemate = false;
                        break;
                    }
                }
            } else if (command.startsWith("Defend")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                int damage = Integer.parseInt(command.split(" ")[3]);

                if (isValidIndex(pirateList, startIndex) && isValidIndex(pirateList, endIndex) && damage >= 1 && damage <= 1000) {

                    for (int i = startIndex; i <= endIndex; i++) {
                        int result = pirateList.get(i) - damage;
                        pirateList.set(i, result);

                        if (result <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            isStalemate = false;
                            break;
                        }
                    }
                }

            } else if (command.startsWith("Repair")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int health = Integer.parseInt(command.split(" ")[2]);

                if (isValidIndex(pirateList, index) && health >= 1 && health <= 1000) {
                    int getElement = pirateList.get(index);
                    if (getElement + health <= maxHealthPerSection) {
                        int result = getElement + health;
                        if (result >= 1 && result <= 1000) {
                            pirateList.set(index, result);
                        }
                    } else {
                        int healthRevised = maxHealthPerSection - getElement;
                        int result = getElement + healthRevised;
                        pirateList.set(index, result);
                    } // !!!!!!!!!!!!!!!!!!!!
                }
            } else if (command.startsWith("Status")) {
                int count = 0;
                for (int i = 0; i < pirateList.size(); i++) {
                    int currentSection = pirateList.get(i);
                    if (currentSection < (maxHealthPerSection * .2)) {
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }

            command = scanner.nextLine();
        }
        if (isStalemate) {
            int pirateShipSum = 0;
            int warshipSum = 0;
            for (int i = 0; i < pirateList.size(); i++) {
                pirateShipSum += pirateList.get(i);
            }
            for (int i = 0; i < warshipList.size(); i++) {
                warshipSum += warshipList.get(i);
            }

            System.out.printf("Pirate ship status: %d%n", pirateShipSum);
            System.out.printf("Warship status: %d%n", warshipSum);

        }
    }

    private static boolean isValidIndex(List<Integer> currentList, int index) {
        if (index >= 0 && index <= currentList.size() - 1 && index <= 200) {
            return true;
        }
        return false;
    }

}
