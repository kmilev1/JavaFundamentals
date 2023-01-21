import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayChest = scanner.nextLine().split("\\|");

        String elements = "";
        int letters = 0;
        int countEndArray= 0;

        boolean isNew = false;
        boolean isElements = true;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Yohoho!")) {
                break;
            }

            String[] input = command.split(" ");
            if (input[0].equals("Loot")) {
                for (int i = 1; i < input.length; i++) {
                    String addWord = "";

                    for (int j = 0; j < arrayChest.length; j++) {
                        if (!input[i].equals(arrayChest[j])) {
                            addWord = input[i];
                            isNew = true;
                        } else {
                            isNew = false;
                            break;
                        }
                    }
                    if (isNew) {
                        elements = addWord + " " + String.join(" ", arrayChest);
                        arrayChest = elements.split(" ");
                    }
                }
                elements = "";

            } else if (input[0].equals("Drop")) {
                if (Integer.parseInt(input[1]) < 1) {
                    continue;
                }
                String keepElement = arrayChest[Integer.parseInt(input[1])];
                String[] newArray = new String[arrayChest.length];
                boolean isDropped = false;

                for (int i = 0; i < arrayChest.length; i++) {
                    if (i == Integer.parseInt(input[1])) { //3==3
                        newArray[i] = arrayChest[i + 1]; //silver (поз 4 от стария масив)
                        isDropped = true;
                        for (int j = i + 1; i < arrayChest.length - 1; j++) {
                            if (j == arrayChest.length - 1) {
                                newArray[j] = keepElement;
                                arrayChest = newArray;
                                break;
                            }
                            newArray[j] = arrayChest[j + 1];
                        }
                    }
                    if (isDropped) {
                        break;
                    } else {
                        newArray[i] = arrayChest[i];
                    }
                }

            } else if (input[0].equals("Steal")) {
                String[] newArray = new String[Integer.parseInt(input[1])];
                int counter = 0;
                for (int i = 0; i < newArray.length; i++) {
                    newArray[i] = arrayChest[arrayChest.length - newArray.length + counter];
                    counter++;
                }

                String print = "";
                String[] endArray = new String[arrayChest.length - newArray.length];

                for (int i = 0; i < endArray.length; i++) {
                    endArray[i] = arrayChest[i];
                    countEndArray++;

                    for (int j = 0; j < endArray[i].length(); j++) {
                        letters++;
                    }
                }

                for (int i = 0; i < newArray.length; i++) {
                    if (i == newArray.length - 1) {
                        print += newArray[i];
                    } else {
                        print += newArray[i] + ", ";
                    }
                }
                System.out.println(print);

                if (newArray.length >= arrayChest.length) {
                    System.out.println("Failed treasure hunt.");
                    isElements = false;
                }

            }
        }
        if (isElements) {
            double avg = (double) letters / countEndArray;
            System.out.printf("Average treasure gain: %.2f pirate credits.", avg);
        }
    }
}
