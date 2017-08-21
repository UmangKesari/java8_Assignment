import java.util.function.BinaryOperator;

public class BinaryOperatorDemo
{
    BinaryOperator<Integer> binaryOperator;
    public int getResult0fBinaryOperator(int x, int y)
    {
        binaryOperator = (a,b) -> a+b ;
        return binaryOperator.apply(x,y);
    }

}
