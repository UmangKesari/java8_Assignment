import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function = (str) -> str.length();
        String s ="Grass is green";
        System.out.println(function.apply(s));
    }
}
