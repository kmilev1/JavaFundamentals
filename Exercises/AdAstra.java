import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String collect = "";
        String pattern = "";

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 47 && text.charAt(i) <= 57) || (text.charAt(i) >= 65 && text.charAt(i) <= 90) || (text.charAt(i) >= 97 && text.charAt(i) <= 122) || text.charAt(i) == 32 || text.charAt(i) == 35 || text.charAt(i) == 124) {
                collect += text.charAt(i);
            }
        } //CLEAR INVALID SYMBOLS


        String dataPattern = "\\d{1,2}/\\d{1,2}/\\d{1,2}";

        int firstIndex = text.indexOf(dataPattern);

        collect = collect
                .replaceAll("#", "|");

        List<String> list = Arrays
                .stream(collect.split("\\|+"))
                .collect(Collectors.toList());
        list.removeAll(Arrays.asList("", null));

        int nutritionCounter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches(dataPattern)) {
                nutritionCounter += Integer.parseInt(list.get(i + 1));
            }
        } //HERE WE COUNT NUTRITION

        int days = nutritionCounter / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        String currentItem = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches(dataPattern)) {
                System.out.print("Item: " + list.get(i - 1) + ", ");
                System.out.print("Best before: " + list.get(i) + ", ");
                System.out.print("Nutrition: " + list.get(i + 1) + "\n");
            }
        }

    }
}
