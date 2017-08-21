import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args{
        String s ="Knoldus";
        Integer a =7;
        BiFunction<String,Integer,Boolean> biFunction = (str,x) -> str.length() == x;

        System.out.println(biFunction.apply(s,a));
    }
}
