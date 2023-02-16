import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> specialNumAndPower = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int specialNumber = specialNumAndPower.get(0);
        int power = specialNumAndPower.get(1);

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);

            if (current == specialNumber) {
                if ((i + power <= numbers.size()) && (i - power >= 0)) {
                    for (int j = i - power; j <= i + power; j++) {
                        numbers.remove(i - power);
                    }
                    i = -1;
                } else if ((i + power >= numbers.size()) && (i - power < 0)) {
                    int initialLength = numbers.size();
                    for (int j = 0; j < initialLength; j++) {
                        numbers.remove(0);
                    }

                } else if (i + power > numbers.size()) {
                    for (int j = i - power; j <= i; j++) {
                        numbers.remove(i - power);
                    }
                    for (int j = i - power; j < numbers.size(); j++) {
                        numbers.remove(i - power);
                    }

                } else if (i - power < 0) {
                    for (int j = 0; j <= i + power; j++) {
                        numbers.remove(0);

                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
