import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> list2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int lastIndex = 0;
        if (list1.size() > list2.size()) {
            for (int i = 0; i < list2.size() * 2; i++) {
                resultList.add(i, list1.get(i / 2));
                resultList.add(i + 1, list2.get(i / 2));
                i++;
                lastIndex = i + 1;
            }
            for (int i = list2.size(); i < list1.size(); i++) {
                resultList.add(lastIndex, list1.get(i));
                lastIndex++;
            }
        } else {
            for (int i = 0; i < list1.size() * 2; i++) {
                resultList.add(i, list1.get(i / 2));
                resultList.add(i + 1, list2.get(i / 2));
                i++;
                lastIndex = i + 1;
            }
            for (int i = list1.size(); i < list2.size(); i++) {
                resultList.add(lastIndex, list2.get(i));
                lastIndex++;
            }
        }
        System.out.println(joinElementsByDelimiter(resultList, " "));
    }

    private static String joinElementsByDelimiter(List<Integer> items, String delimeter) {
        String output = "";
        for (Integer item : items) {
            output += item + delimeter;
        }
        return output;
    }
}
