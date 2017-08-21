import java.util.function.UnaryOperator;

public class UnaryOperatorDemo
{
    public static void main(String[] args)
    {
        UnaryOperator<Integer> unaryOperator = x -> ~x ;
        System.out.println(unaryOperator.apply(5));
    }
}
