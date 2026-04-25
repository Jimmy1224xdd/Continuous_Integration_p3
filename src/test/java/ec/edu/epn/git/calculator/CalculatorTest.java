package ec.edu.epn.git.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {
        Calculator c = new Calculator();
        int actual = c.addition(4, 7);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        Calculator c = new Calculator();
        int actual = c.subtraction(7, 1);
        int expected = 6;
        assertEquals(expected, actual);
    }
}
