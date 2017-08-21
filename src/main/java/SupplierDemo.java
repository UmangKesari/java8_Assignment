import java.util.function.Supplier;

class SupplierDemo
{
    public int usingSupplier(int a, int b){

/*
        Supplier<Integer> supplier = () -> System.out.println("Using Supplier Interface");
*/
        Supplier<Integer> supplier = () -> a+b;
        return supplier.get();


    }
}
