package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(validUserName.test("user@12345"));
        System.out.println(validUserName.test("user@1"));
        System.out.println("is Email Valid: "+ validUserName.and(validEmail).test("yasar@gmail.com"));
        System.out.println("Substring?: "+contains.test("station","manifestation"));
        System.out.println("Substring?: "+contains.test("one","Anonymous    "));
    }


    static Predicate<String> validUserName =
            uname -> uname.length() > 8 && uname.contains("@") ;

    static Predicate<String> validEmail =
            email -> email.contains(".com") || email.contains(".org");

    static BiPredicate<String, String> contains =
            (string1 , string2) -> string1.contains(string2) || string2.contains(string1) ;

}
