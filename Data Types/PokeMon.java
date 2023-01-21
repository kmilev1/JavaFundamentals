import java.math.BigDecimal;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long pokePowerN = Long.parseLong(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        long pokePowerOriginalValue = pokePowerN;

        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            counter++;
            if (pokePowerOriginalValue / 2 == pokePowerN && exhaustionFactorY != 0) {
                if (pokePowerN / exhaustionFactorY > 0) {
                    pokePowerN /= exhaustionFactorY;
                }
            }
        }

        System.out.println(pokePowerN);
        System.out.println(counter);
    }
}
