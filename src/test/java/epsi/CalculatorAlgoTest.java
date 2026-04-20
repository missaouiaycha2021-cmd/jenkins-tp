package epsi;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for CalculatorAlgo.
 */
public class CalculatorAlgoTest {

    private final CalculatorAlgo algo = new CalculatorAlgo();

    @Test
    public void shouldAddTwoNumbers() {
        assertEquals("2 + 3 should be 5", 5, algo.add(2, 3));
    }

    // Tests pour la multiplication (Exemple 5)
    @Test
    public void shouldMultiplyPositiveNumbers() {
        assertEquals("2 * 3 should be 6", 6, algo.multiply(2, 3));
    }

    @Test
    public void shouldMultiplyByZero() {
        assertEquals("5 * 0 should be 0", 0, algo.multiply(5, 0));
    }

    @Test
    public void shouldMultiplyNegativeNumbers() {
        assertEquals("-2 * 3 should be -6", -6, algo.multiply(-2, 3));
        assertEquals("-2 * -3 should be 6", 6, algo.multiply(-2, -3));
    }
}
