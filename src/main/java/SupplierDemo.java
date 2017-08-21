import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args){

        int a =5,b=5;
/*
        Supplier<Integer> supplier = () -> System.out.println("Using Supplier Interface");
*/
        Supplier<Integer> supplier = () -> a+b;
        supplier.get();


    }
}
