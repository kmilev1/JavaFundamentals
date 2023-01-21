import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letters = scanner.nextLine().split(" ");

        for (int i = 0; i < letters.length / 2; i++) {
            String oldElement = letters[i]; // съхранява стойността на елемента на позиция 0 напр.
            letters[i] = letters[letters.length - 1 - i]; // на позиция 0 идва елемента == поз. 4
            letters[letters.length - 1 - i] = oldElement; // на поз. 4 прехвърляме елемента който съхранихме в oldElement
        }

        System.out.println(String.join(" ", letters));
    }
}
