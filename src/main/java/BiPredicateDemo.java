import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String... args){
        String a ="Ram", b= "Shyam";

        BiPredicate<String,String> biPredicate = (str1,str2) -> str1.length() == str2.length();

        System.out.println(biPredicate.test(a,b));

    }
}
