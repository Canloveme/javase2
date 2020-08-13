import com.itheima.myjunit.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author csq
 * @date 2020/8/13 14:38
 */
public class CalculatorTest {
    private Calculator calculator = null;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(1, 2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(1, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.division(4, 2);
        Assert.assertEquals(2, result);
    }
}