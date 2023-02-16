import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(scanner.nextLine());
        int[] arrCurrent = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isPeople = true;

        for (int i = 0; i < arrCurrent.length; i++) { // count of wagons == 4
            if (arrCurrent[i] > 4) {
                break;
            }
            while (arrCurrent[i] != 4) { // броим от стойността на текущия елемент в масива до 4
                if (countOfPeople > 0) {
                    arrCurrent[i]++;
                    countOfPeople--;
                    if (countOfPeople == 0) {
                        isPeople = false;
                        break;
                    }
                } else {
                    isPeople = false;
                    break;
                }
            }
        }

        String print = "";
        for (int i = 0; i < arrCurrent.length; i++) {
            print += arrCurrent[i] + " ";
        }

        if (countOfPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", countOfPeople);
            System.out.println(print);
        } else if (arrCurrent[arrCurrent.length-1] == 4 && !isPeople) {
            System.out.println(print);
        } else {
            System.out.println("The lift has empty spots!");
            System.out.println(print);
        }
    }
}
