import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        if (numbers.size() % 2 == 1) {
            for (int i = 0; i < numbers.size() / 2; i++) {
                numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
                numbers.remove(numbers.size() - 1);

            } //odd list size
        } else {
            for (int i = 0; i < numbers.size() / 2 + 1; i++) {
                numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
                numbers.remove(numbers.size() - 1);

            } //even list size
        }
        System.out.println(joinElementsByDelimiter(numbers, " "));
    }

    private static String joinElementsByDelimiter(List<Double> items, String delimeter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimeter);
        }
        return output;
    }
}
