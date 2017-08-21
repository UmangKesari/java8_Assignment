import java.util.function.BiFunction;

public class BiFunctionDemo {

    public boolean getResultOfBiFunction(String str,int a) {

        BiFunction<String,Integer,Boolean> biFunction = (s,x) -> s.length() == x;
        return biFunction.apply(str,a);
    }
}
