import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(2000.99);

        System.out.println(principal.setScale(1, RoundingMode.HALF_DOWN));
        System.out.println(principal.setScale(2,RoundingMode.HALF_UP));
    }
}
