import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {
    private final int sum = 10_000_000;
    private final double percent = 8.5;
    private final int period = 240;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testPayMonth() {
        int expected = 86_782;
        int actual = calculator.payMonth(sum, percent, period);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testAllReturn() {
        int expected = 20_827_757;
        int actual = calculator.allReturn(sum, percent, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPay() {
        int expected = 10_827_757;
        int actual = calculator.overPay(sum, percent, period);
        Assertions.assertEquals(expected, actual);
    }
}
