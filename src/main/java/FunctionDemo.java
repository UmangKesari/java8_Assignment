import java.util.function.Function;

public class FunctionDemo {

    Function<String,Integer> function = (str) -> str.length();

    public int usingFunction(String str)
    {
         return (function.apply(str));
    }
}
