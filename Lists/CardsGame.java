import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> player2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (player1.size() > 0 && player2.size() > 0) {
            int firstElement = player1.get(0);
            int secondElement = player2.get(0);

            if (firstElement > secondElement) {
                player1.remove(0);
                player2.remove(0);

                player1.add(firstElement);
                player1.add(secondElement);
            } else if (firstElement < secondElement) {
                player1.remove(0);
                player2.remove(0);

                player2.add(secondElement);
                player2.add(firstElement);
            } else {
                player1.remove(0);
                player2.remove(0);
            }
        }
        int sum = 0;
        String player = "";
        if (player1.size() > 0) {
            for (int i = 0; i < player1.size(); i++) {
                sum += player1.get(i);
            }
            player = "First";
        } else if (player2.size() > 0) {
            for (int i = 0; i < player2.size(); i++) {
                sum += player2.get(i);
            }
            player = "Second";
        }
        System.out.printf("%s player wins! Sum: %d", player, sum);
    }
}
