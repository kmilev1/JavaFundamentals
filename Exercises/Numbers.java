import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }

        double avgNum = sum * 1.0 / list.size();

        List<Integer> greaterNumbers = new ArrayList<>();
        for (Integer integer : list) {
            if (avgNum < integer) {
                greaterNumbers.add(integer);
            }
        }

        if (greaterNumbers.size() == 0) {
            System.out.println("No");
        }

        Collections.sort(greaterNumbers);
        Collections.reverse(greaterNumbers);

        List<Integer> outputNumbers = new ArrayList<>();

        if (greaterNumbers.size() > 5) {
            for (int i = 0; i < 5; i++) {
                outputNumbers.add(greaterNumbers.get(i));
            }
        } else {
            outputNumbers = greaterNumbers;
        }

        String output = outputNumbers.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "");
        System.out.print(output);
    }
}
