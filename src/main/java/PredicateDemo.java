import java.util.function.Predicate;

public class PredicateDemo {

    public static boolean computePredicate(Predicate<Integer> predicate){
        return predicate.test(1);
    }

    public static void main(String[] args){
        Predicate<Integer> predicate = a -> a>3;
        System.out.println(predicate.test(5));
        System.out.println(computePredicate(predicate));
    }
}
