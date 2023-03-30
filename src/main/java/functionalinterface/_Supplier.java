package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        String name = nameSupplier.get();
        System.out.println(name);
        int number = valueSupplier.get();
        System.out.println(number);
        int number2 = intValueSupplier.get();
        System.out.println();
    }

    static Supplier<String> nameSupplier = () -> "Yasar" ;
    static Supplier<Integer> valueSupplier = () -> Integer.valueOf("100");
    static Supplier<Integer> intValueSupplier = () -> Integer.parseInt("100");

}
