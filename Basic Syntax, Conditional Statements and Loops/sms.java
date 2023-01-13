import java.util.Scanner;

public class sms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countLetters = Integer.parseInt(scanner.nextLine());

        String[] button2 = {"a", "b", "c"};
        String[] button3 = {"d", "e", "f"};
        String[] button4 = {"g", "h", "i"};
        String[] button5 = {"j", "k", "l"};
        String[] button6 = {"m", "n", "o"};
        String[] button7 = {"p", "q", "r", "s"};
        String[] button8 = {"t", "u", "v"};
        String[] button9 = {"w", "x", "y", "z"};
        String[] button0 = {" "};

        String lastOne = "";
        String consol = "";

        for (int i = 0; i < countLetters; i++) {
            String number = scanner.nextLine();
            if (String.valueOf(number.charAt(0)).equals("2")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button2[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("3")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button3[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("4")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button4[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("5")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button5[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("6")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button6[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("7")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button7[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("8")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button8[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("9")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button9[j];
                }
            } else if (String.valueOf(number.charAt(0)).equals("0")) {
                for (int j = 0; j < number.length(); j++) {
                    lastOne = button0[j];
                }
            }
            consol += lastOne;
        }
        System.out.println(consol);
    }
}
