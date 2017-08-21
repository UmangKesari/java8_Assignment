package Streams;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamsDemoTest
{
    PrimitiveStreamsDemo primitiveStreamsDemo = new PrimitiveStreamsDemo();
    IntStream stream = IntStream.of(1,2,3,4,5,6);

    @Test
    public void getMax()
    {
        assertEquals(primitiveStreamsDemo.getMax(stream) , 6);
        //assertEquals(primitiveStreamsDemo.getMax(stream),5);

    }

    @Test
    public void getAverage()
    {
        LongStream stream = LongStream.of(4532,546,21,4812,3423);
        assertEquals(primitiveStreamsDemo.getAverage(stream),2666.8,0.001);
    }
}
