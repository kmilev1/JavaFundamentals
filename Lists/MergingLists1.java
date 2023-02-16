import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists1 {
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

        for (int i = 0; i < Math.min(list1.size(), list2.size()) * 2; i++) {
            resultList.add(i, list1.get(i / 2));
            resultList.add(i + 1, list2.get(i / 2));
            i++;
        }

        if (list1.size() > list2.size()) {
            resultList.addAll(getRemainingElements(list1, list2));
        } else {
            resultList.addAll(getRemainingElements(list2, list1));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();

        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));
        }
        return nums;
    }
}
