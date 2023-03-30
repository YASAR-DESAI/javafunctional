package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    static _Function obj ;

    public static void main(String[] args) {
        obj = new _Function();
        String message = addGreetingsFunction.apply("Yasar");
        System.out.println(message);

        String wholeMessage = addGreetingsFunction.andThen(askQuestion).apply("yasar");
        System.out.println(wholeMessage);

        String anotherMessage = addGreetingsFunction.andThen(askQuestion).apply("Yasar") + askHowAreYou.apply("Yasar");
        System.out.println(anotherMessage);

        long numberSquared = getSquareFunction.apply(333);
        System.out.println(numberSquared);

        //BiFunctions
        long product = obj.multiplyByFunction.apply((long)10,(long)20);
        System.out.println(product);


    }

    static Function<String, String> addGreetingsFunction = name -> "Hello " + name + "!";
    static Function<String, String> askQuestion = string -> string + " How was your day?";
    static Function<String, String> askHowAreYou = s -> " How are you " + s +" ?";

    static Function<Integer, Long> getSquareFunction = number -> (long)number * number ;

    BiFunction<Long, Long, Long> multiplyByFunction =
            (multiply , multiplyBy) -> multiply * multiplyBy;

}


