package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {

        String name = null;

      Object value =   Optional.of("Yasar").orElseGet( () -> "Desai");
      Object value2 = Optional.ofNullable(name).orElseGet( () -> "Desai");

        Optional.ofNullable("yasardesai").ifPresent(username -> System.out.println());
        Optional.ofNullable(null).ifPresentOrElse(username -> System.out.println() , () ->
        {
            System.out.println("No username found!");
        });

        System.out.println(value);
        System.out.println(value2);


    }
}
