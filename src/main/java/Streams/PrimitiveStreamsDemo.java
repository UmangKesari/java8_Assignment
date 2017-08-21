package Streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamsDemo
{
    public int getMax(IntStream stream){
        return stream.max().getAsInt();
    }

    public double getAverage(LongStream stream){
        return stream.average().getAsDouble();
    }

    public static void main(String[] args)
    {
        PrimitiveStreamsDemo primitiveStreamsDemo = new PrimitiveStreamsDemo();

        IntStream stream = IntStream.of(1,2,3,4,5,6);
        LongStream stream1 = LongStream.of(4532,546,21,4812,3423);

        System.out.println(primitiveStreamsDemo.getMax(stream));
        System.out.println(primitiveStreamsDemo.getAverage(stream1));
    }
}
