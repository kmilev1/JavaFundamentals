import java.math.BigDecimal;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float floatPI = 3.141592653589793238f;
        double doublePI = 3.14159265358979323845545454d;


        float floatPI1 = 3.141592653589793238f;
        double doublePI1 = 3.14159265358979323845545454;

        System.out.println(floatPI);
        System.out.println(doublePI);
        System.out.println(floatPI1);
        System.out.println(doublePI1);

        BigDecimal abc = new BigDecimal(doublePI);
        abc = abc.add(BigDecimal.valueOf(666.3652));
        System.out.println(abc);
        abc = abc.subtract(BigDecimal.valueOf(5556));
        System.out.println(abc);
        abc = abc.divide(BigDecimal.valueOf(2));
        System.out.println(abc);
        abc = abc.multiply(BigDecimal.valueOf(443));
        System.out.println(abc);

    }
}
