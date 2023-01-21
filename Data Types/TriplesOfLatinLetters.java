import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String print = "";

        for (int i = 0; i < input; i++) {
            String firstChar = String.valueOf((char) (97 + i));

            for (int j = 0; j < input; j++) {
                String secondChar = String.valueOf((char) (97 + j));

                for (int k = 0; k < input; k++) {

                    String thirdChar = String.valueOf((char) (97 + k));

                    System.out.println(firstChar + secondChar + thirdChar);

                }
            }
        }
    }
}
