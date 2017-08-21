
interface First{
    default void arithmatic(int a , int b){
        int sum = a+b;
        System.out.println("Running First Interface method"+ sum );
    }
}

interface Second{
    default void arithmatic(int a, int b){
        int diff = a-b;
        System.out.println("Running First Interface method" + diff);

    }
}

public class MultipleInheritance implements First,Second {

        public void arithmatic(int a,int b){
            First.super.arithmatic(a,b);
        }
        public static void main(String[] args){
            MultipleInheritance mul = new MultipleInheritance();
            mul.arithmatic(5,6);
            //Long l = (Integer.MAX_VALUE);

        }
}
