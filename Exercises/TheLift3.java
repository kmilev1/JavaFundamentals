import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] currentState = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEmptySpots = true;

        for (int i = 0; i < currentState.length; i++) {
            int capacity = currentState[i];
            if (currentState[i] < 4) {
                while (capacity < 4 && people > 0) {
                    people -= 1;
                    currentState[i] +=1;
                    capacity++;
                }
            }
        } // count of wagons
//        for (int i = 0; i < currentState.length; i++) {
//            if (currentState[i] == 4) {
//            } else {
//                isEmptySpots = true;
//            }
//        }
        if (currentState[currentState.length-1] == 4) {
            isEmptySpots = false;
        }
        if (people == 0 && isEmptySpots) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < currentState.length; i++) {
                System.out.printf(currentState[i] + " ");
            }
        } else if (people > 0 && !isEmptySpots) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            for (int i = 0; i < currentState.length; i++) {
                System.out.printf(currentState[i] + " ");
            }
        } else if (people == 0 && !isEmptySpots) {
            for (int i = 0; i < currentState.length; i++) {
                System.out.printf(currentState[i] + " ");
            }
        }
    }
}
