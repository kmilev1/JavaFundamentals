import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {

            if (command.startsWith("merge")) {
                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int endIndex = Integer.parseInt(command.split("\\s+")[2]);

                if (endIndex > list.size() - 1) {
                    endIndex = list.size() - 1;
                } // !!!!!!!! list.size() - 1 !!!! >-1< !!!!
                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (startIndex < endIndex) {
                    List<String> subList = list.subList(startIndex, endIndex + 1);

                    String concatenation = "";

                    for (String element : subList) {
                        concatenation += element;
                    }
                    list.subList(startIndex, endIndex + 1).clear();
                    list.add(startIndex, concatenation);
                }
            } else if (command.startsWith("divide")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int partitions = Integer.parseInt(command.split("\\s+")[2]);

                if (index >= 0 && index < list.size() && partitions >= 0 && partitions <= 100) {
                    char[] dividedText = list.get(index).toCharArray();

                    int charsPerIndex = dividedText.length / partitions;
                    int extraChars = dividedText.length % partitions;

                    List<String> elementsToAdd = new ArrayList<>();
                    for (int i = 0; i < partitions; i++) {
                        if (i != partitions - 1) {
                            elementsToAdd.add(list.get(index).substring(i * charsPerIndex, i * charsPerIndex + charsPerIndex));
                        } else {
                            elementsToAdd.add(list.get(index).substring(i * charsPerIndex, i * charsPerIndex + charsPerIndex + extraChars));
                        }
                    }
                    list.remove(index);
                    list.addAll(index, elementsToAdd);
                }

            }
            command = scanner.nextLine();
        }
        String output = list.toString().replaceAll("[\\]\\[,]", "");
        System.out.print(output);
    }
}
