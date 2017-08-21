package DateAndTimeTest;


import DateAndTime.ExactAge;
import org.junit.Assert;
import org.junit.Test;

public class ExactAgeTest
{
    ExactAge exactAge = new ExactAge();

    @Test
    public void testExactAge()
    {
        Assert.assertEquals(exactAge.findAge(1994,1,3),"23years 7months 18days");
    }

}