import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args){
        BinaryOperator<Integer> binaryOperator = (a,b) -> a+b ;
        System.out.print(binaryOperator.apply(5,6));
    }
}
