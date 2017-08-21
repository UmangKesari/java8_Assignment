import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryOperatorDemoTest
{
    BinaryOperatorDemo test = new BinaryOperatorDemo();
    @Test
    public void binaryOperatorTest()
    {
        assertEquals(test.getResult0fBinaryOperator(5,6),11);
    }

}
