package ec.edu.epn.git.calculator;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class CalculatorMockitoTest {
    @Test
    public void given_two_integers_when_addition_then_ok() {
        Calculator c = mock(Calculator.class);
        when(c.addition(4, 7)).thenReturn(11);

        int result = c.addition(4, 7);

        assertEquals(11, result);
        verify(c).addition(4, 7);
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        Calculator c = mock(Calculator.class);
        when(c.subtraction(7, 1)).thenReturn(6);

        int result = c.subtraction(7, 1);

        assertEquals(6, result);
        verify(c).subtraction(7, 1);
    }
}