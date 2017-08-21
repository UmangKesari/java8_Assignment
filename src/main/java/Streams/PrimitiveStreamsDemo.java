package Streams;

import java.util.stream.IntStream;

public class PrimitiveStreamsDemo
{
    public static int getMax(IntStream stream){
        return stream.max().getAsInt();
    }

    public double getAverage(IntStream stream){
        return stream.average().getAsDouble();
    }

    public static void main(String[] args)
    {
        IntStream stream = IntStream.of(1,2,3,4,5,6);
        System.out.println(getMax(stream));
    }
}
