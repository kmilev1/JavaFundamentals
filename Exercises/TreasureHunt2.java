import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split("\\|+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] currentCommand = command.split(" ");
            if (command.startsWith("Loot")) {
                for (int i = 1; i < currentCommand.length; i++) {
                    if (!list.contains(currentCommand[i])) {
                        list.add(0, currentCommand[i]);
                    }
                }
            } else if (command.startsWith("Drop")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= 200 && index <= list.size()) {
                    list.add(list.get(index));
                    list.remove(index);
                }
            } else if (command.startsWith("Steal")) {
                int count = Integer.parseInt(command.split(" ")[1]);
                List<String> stolen = new ArrayList<>();
                String output = "";
                if (list.size()-count <= 0) {
                    stolen.addAll(list);

                    output = String.join(", ", stolen);
                    System.out.println(output);

                    list.removeAll(list);
                } else {
                    stolen = list.subList(list.size()-count, list.size());

                    output = String.join(", ", stolen);
                    System.out.println(output);

                    for (int i = 0; i < count; i++) {
                        list.remove(list.size()-1);
                    }
                }
            }
            command = scanner.nextLine();
        }
        if (list.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int counter = 0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    counter++;
                }
            }
            double avg = counter * 1.0 / list.size();

            System.out.printf("Average treasure gain: %.2f pirate credits.", avg);
        }
    }
}
