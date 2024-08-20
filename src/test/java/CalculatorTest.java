
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testBasicOperations() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.calculate(Operation.ADD, 2, 3));
        assertEquals(1.0, calculator.calculate(Operation.SUBTRACT, 3, 2));
        assertEquals(6.0, calculator.calculate(Operation.MULTIPLY, 2, 3));
        assertEquals(2.0, calculator.calculate(Operation.DIVIDE, 6, 3));
    }

    @Test
    public void testChainedOperations() {
        Calculator calculator = new Calculator();
        Object[][] operations = {
                {Operation.ADD, 5},
                {Operation.SUBTRACT, 2},
                {Operation.MULTIPLY, 3},
                {Operation.DIVIDE, 3}
        };
        assertEquals(4.0, calculator.chainCalculate(1.0, operations));
    }


    @Test
    void exceptionTesting() {
        Calculator calculator = new Calculator();
        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
                calculator.calculate(Operation.DIVIDE, 1, 0));

        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void testInvalidOperation() {
        Calculator calculator = new Calculator();
        assertThrows(UnsupportedOperationException.class, () ->
                calculator.calculate(Operation.fromString("INVALID_OPERATION"), 2, 3));

    }

}