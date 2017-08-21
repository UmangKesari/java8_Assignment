import org.junit.Test;

import static org.junit.Assert.*;
public class PredicateDemoTest
{
    PredicateDemo predicateDemo = new PredicateDemo();
    @Test
    public void testPredicate()
    {
        assertEquals(predicateDemo.computePredicate(5),true);
    }


}
