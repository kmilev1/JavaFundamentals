import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        boolean isBalanced = true;
        int counterOpened = 0;
        int counterClosed = 0;


        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            if (input.equals("(") && isBalanced) {
                isBalanced = false; //opened bracket
                counterOpened++;
            } else if (input.equals("(") && !isBalanced) {
                counterOpened++;
            } else if (input.equals(")") && !isBalanced) {
                counterClosed++;
                if (counterClosed == counterOpened) {
                    isBalanced = true;
                }
            } else if (input.equals(")") && isBalanced) {
                isBalanced = false;
                break;
            }
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
