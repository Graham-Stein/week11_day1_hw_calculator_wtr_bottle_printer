import static junit.framework.TestCase.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAddNumber(){
        assertEquals(10, calculator.getAdd(5, 5));
    }

    @Test
    public void hasSubtractNumber(){
        assertEquals(10, calculator.getSubtract(15, 5));
    }

    @Test
    public void hasMultiplyNumber(){
        assertEquals(25, calculator.getMultiply(5, 5));
    }

    @Test
    public void hasDivideNumber(){
        assertEquals(1, calculator.getDivide(5, 5));
    }

}
