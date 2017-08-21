import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args){
        Consumer<Integer> consumer = a -> System.out.println(a) ;
        consumer.accept(5);
    }
}
