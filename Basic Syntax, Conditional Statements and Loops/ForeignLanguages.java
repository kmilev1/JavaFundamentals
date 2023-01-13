import java.util.Objects;
import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String lang = "";

        if (country.equals("USA") || country.equals("England")) {
            lang = "English";
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) {
            lang = "Spanish";
        } else {
            lang = "unknown";
        }
        System.out.println(lang);
    }
}