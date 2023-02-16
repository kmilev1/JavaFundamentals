import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandArr = command.split(":");
            String operation = commandArr[0];
            String lessonTitle = commandArr[1];

            if (operation.equals("Add") && !list.contains(lessonTitle)) {
                list.add(lessonTitle);

            } else if (operation.equals("Insert") && !list.contains(lessonTitle)) {
                int index = Integer.parseInt(commandArr[2]);
                list.add(index, lessonTitle);

            } else if (operation.equals("Remove") && list.contains(lessonTitle)) {
                list.remove(lessonTitle);
                if(list.get(list.indexOf(lessonTitle) + 1).equals(lessonTitle+"-Exercise")) {
                    String stringToRemove = lessonTitle + "-Exercise";
                    list.remove(stringToRemove);
                }

            } else if (operation.equals("Swap") && list.contains(commandArr[1]) && list.contains(commandArr[2])) {
                int index1 = list.indexOf(commandArr[1]); //lesson1 index
                int index2 = list.indexOf(commandArr[2]); //lesson2 index
                String lessonTitle2 = commandArr[2];
                list.set(index1, lessonTitle2);
                list.set(index2, lessonTitle);

                if (list.contains(lessonTitle + "-Exercise")) {
                    int getIndex = list.indexOf(lessonTitle);
                    list.remove(lessonTitle + "-Exercise");
                    list.add(getIndex+1, lessonTitle + "-Exercise");

                }
                if (list.contains(lessonTitle2 + "-Exercise")) {
                    int getIndex = list.indexOf(lessonTitle2);
                    list.remove(lessonTitle2 + "-Exercise");
                    list.add(getIndex+1, lessonTitle2 + "-Exercise");

                }
            } else if (operation.equals("Exercise") && list.contains(lessonTitle) && !list.contains(lessonTitle + "-Exercise")) {
                int index = list.indexOf(lessonTitle); // !!!! забравен индекс!!!!!!!!!
                list.add(index+1, lessonTitle + "-Exercise");

            } else if (operation.equals("Exercise") && !list.contains(lessonTitle) && !list.contains(lessonTitle +"-Exercise")) {
                list.add(lessonTitle);
                list.add(lessonTitle + "-Exercise");
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "." + list.get(i));
        }
    }
}
