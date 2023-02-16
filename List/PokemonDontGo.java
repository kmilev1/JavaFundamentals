import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;
        int number = 0;

        while (list.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                number = list.get(0);
                sumRemoved += number;

                list.remove(0);
                list.add(0, list.get(list.size() - 1));

            } else if (index > list.size() - 1) {
                number = list.get(list.size()-1);
                sumRemoved += number;

                list.remove(list.size() - 1);
                list.add(list.get(0));

            } else {
                number = list.get(index);
                sumRemoved += number;

                list.remove(index);
            }

            for (int k = 0; k < list.size(); k++) {
                if (list.get(k) <= number) {
                    list.set(k, list.get(k) + number);
                } else {
                    list.set(k, list.get(k) - number);
                }
            }
        }
        System.out.println(sumRemoved);
    }
}
