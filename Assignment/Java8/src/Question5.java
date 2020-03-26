import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    public static void main(String[] args) {
        //<-----------------Cosumer-------------------------->
        Consumer<Integer> consumer=(e)->{
            System.out.println(e);

        };
        consumer.accept(3);
        //<---------------------Supplier------------------------------>
        Supplier supplier=()->{
            return "string";
        };
        System.out.println(supplier.get());
        //<-------------------------Predicate---------------->
        Predicate<Integer> predicate=(e)->e%2==0;
        System.out.println(predicate.test(4));
        //<----------------------Function--------------->
        Function<Integer,Integer> function=(e)->{
          return e*2;
        };
        System.out.println(function.apply(5));
    }
}
