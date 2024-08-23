import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void init() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatWorksCorrectlyForInput1() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testThatWorksCorrectlyForInput3() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testThatThrowsExceptionForInput0() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalculator.sum(0)
        );
    }
}
