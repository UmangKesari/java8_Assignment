import java.util.function.DoubleFunction;

/**
 * Created by knoldus on 8/18/17.
 */
public class DoubleFunctionDemo {
    public static void main(String... args){
        DoubleFunction<Double> doubleFunction = x -> x * 2.5;
        System.out.println(doubleFunction.apply(4.0));

    }
}
