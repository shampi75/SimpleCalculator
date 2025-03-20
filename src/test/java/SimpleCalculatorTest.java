import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    @Test
    public void twoPlustwoEqFour(){
        var Calculator  = new SimpleCalculator();
        assertEquals(4, Calculator.add(2,2));
    }


}