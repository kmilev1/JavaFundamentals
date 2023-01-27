import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        int counter = 0;
        boolean isStolen = false;

        while (!command.equals("Yohoho!")) {
            String[] inputArr = command.split(" ");

            if (inputArr[0].equals("Loot")) {
                for (int i = 1; i < inputArr.length; i++) {
                    boolean isPresented = true;
                    for (int j = 0; j < arrayChest.length; j++) {
                        if (!inputArr[i].equals(arrayChest[j])) {
                            isPresented = false;
                        } else {
                            isPresented = true;
                            break;
                        }
                    }
                    if (!isPresented) {
                        String[] tempArr = new String[arrayChest.length + 1];
                        for (int j = 0; j < tempArr.length; j++) {
                            if (j == 0) {
                                tempArr[j] = inputArr[i];
                            } else {
                                tempArr[j] = arrayChest[j - 1];
                            }
                        }
                        arrayChest = tempArr;

                    }
                }

            } else if (inputArr[0].equals("Drop") && Integer.parseInt(inputArr[1]) >= 0 && Integer.parseInt(inputArr[1]) <= arrayChest.length - 1) {

                if ((Integer.parseInt(inputArr[1]) < 0) || Integer.parseInt(inputArr[1]) >= arrayChest.length-1) {
                    break;
                }
                String keepElement = arrayChest[Integer.parseInt(inputArr[1])];

                for (int j = Integer.parseInt(inputArr[1]); j < arrayChest.length; j++) {
                    if (j == arrayChest.length-1) {
                        arrayChest[arrayChest.length-1] = keepElement;
                    } else {
                        arrayChest[j] = arrayChest[j+1];
                    }
                }

            } else if (inputArr[0].equals("Steal")) {
                String[] stolen = new String[Integer.parseInt(inputArr[1])];

                if (Integer.parseInt(inputArr[1]) >= 0 && arrayChest.length > Integer.parseInt(inputArr[1])) {
                    for (int i = 0; i < stolen.length; i++) {
                        stolen[i] = arrayChest[arrayChest.length - Integer.parseInt(inputArr[1]) + i];
                    }
                    String printStolen = String.join(", ", stolen);
                    System.out.println(printStolen);

                    String[] tempArr = new String[arrayChest.length - stolen.length];
                    for (int i = 0; i < tempArr.length; i++) {
                        tempArr[i] = arrayChest[i];
                    }
                    arrayChest = tempArr;

                } else if (Integer.parseInt(inputArr[1]) >= 0) {
                    isStolen = true;
                    String printStolen = String.join(", ", arrayChest);
                    System.out.println(printStolen);
                    arrayChest = new String[0];

                }
            }
            command = scanner.nextLine();
        }

        if (!isStolen) {
            int sumLength = 0;
            counter = 0;

            for (int i = 0; i < arrayChest.length; i++) {
                sumLength += arrayChest[i].length();
                counter++;
            }
            double calc = (double) sumLength / counter;

            if (sumLength > 0) {
                System.out.printf("Average treasure gain: %.2f pirate credits.", calc);
            }
        } else {
            System.out.print("Failed treasure hunt.");
        }
    }
}
