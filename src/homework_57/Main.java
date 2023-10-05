package homework_57;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    // Supplier<T> -  не принимает ничего, возвращает обьект типа T
    //   его метод T get()
    // Todo:  пример придумать самостоятельно
    public static void main(String[] args) {


        Supplier<String> supplier = () -> "Abcd!";
        System.out.println(supplier.get());
        Supplier<Integer> supplier1 = () -> 1234567;
        System.out.println(supplier1.get());


        // BiFunction<Integer,Integer,String> biFunction = Integer::sum;
        // Todo:  пример придумать самостоятельно

        BiFunction<Integer, Integer, String> biFunction = (a, d) -> a + "" + d;
        System.out.println(biFunction.apply(2, 3));

    }
}


