import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;

        int dayCounter = 1;
        boolean isFood = true;

        while (dayCounter <= 30) {
            food -= 300;

            if (dayCounter % 3 == 0) {
                cover -= weight / 3;
            }
            if (dayCounter % 2 == 0) {
                hay -= food * .05;
            }

            if ((food <= 0) || (hay <= 0) || (cover <= 0)) {
                isFood = false;
                break;
            }
            dayCounter++;
        }
        if (isFood) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food / 1000, hay / 1000, cover / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}


