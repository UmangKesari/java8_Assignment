import java.util.function.Predicate;

public class PredicateDemo {

    Predicate<Integer> predicate = a -> a>3;
    public boolean computePredicate(int a)
    {
        return predicate.test(a);
    }

}
