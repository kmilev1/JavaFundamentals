import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String[] messageArr = message.split("");

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] decipherArr = command.split("\\|");

            if (decipherArr[0].equals("ChangeAll")) {
                for (int i = 0; i < messageArr.length; i++) {
                    if (messageArr[i].equals(decipherArr[1])) {
                        messageArr[i] = decipherArr[2];
                    }
                }
            } else if (decipherArr[0].equals("Insert")) {
                String[] newTempArr = new String[messageArr.length + decipherArr[2].length()];
                for (int i = 0; i < newTempArr.length; i++) {
                    if (i < Integer.parseInt(decipherArr[1])) {
                        newTempArr[i] = messageArr[i];
                    } else if (String.valueOf(i).equals(decipherArr[1])) {
                        int index = i;
                        for (int j = 0; j < decipherArr[2].length(); j++) {
                            newTempArr[index++] = String.valueOf(decipherArr[2].charAt(j));
                        }
                        i = index - 1;
                    } else {
                        newTempArr[i] = messageArr[i - decipherArr[2].length()];
                    }
                }
                messageArr = newTempArr;
            } else if (decipherArr[0].equals("Move")) {
                String[] moveElements = new String[Integer.parseInt(decipherArr[1])];
                String[] firstElements = new String[messageArr.length - Integer.parseInt(decipherArr[1])];
                for (int i = 0; i < messageArr.length; i++) {
                    if (i < Integer.parseInt(decipherArr[1])) {
                        moveElements[i] = messageArr[i];
                    } else {
                        firstElements[i - Integer.parseInt(decipherArr[1])] = messageArr[i];
                    }
                }
                List list = new ArrayList(Arrays.asList(firstElements));
                list.addAll(Arrays.asList(moveElements));

                for (int i = 0; i < list.size(); i++) {
                    messageArr[i] = (String) list.get(i);
                }

            }
            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", String.join("", messageArr));
    }
}

// 0 zzHE
// 1 llHe
// 2 lloHe
// 3 Hello