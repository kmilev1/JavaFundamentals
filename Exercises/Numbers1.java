import java.util.*;
import java.util.stream.Collectors;

public class Numbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }
        double avg = sum * 1.0 / list.size();

        List<Integer> greaterNums = new ArrayList<>();

        for (Integer integer : list) {
            if (integer > avg) {
                greaterNums.add(integer);
            }
        }
        Collections.sort(greaterNums);
        Collections.reverse(greaterNums);

        List<Integer> outputList = new ArrayList<>();
        int iterations = 0;

        if (greaterNums.size() == 0) {
            System.out.println("No");
        }

        iterations = Math.min(greaterNums.size(), 5);

        for (int i = 0; i < iterations; i++) {
            outputList.add(greaterNums.get(i));
        }

        String output = Arrays.asList(outputList).toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(output);
    }
}
