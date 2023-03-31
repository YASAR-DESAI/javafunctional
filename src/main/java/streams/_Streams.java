package streams;

import imperative.Main;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;

public class _Streams {


    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("Jim", MALE),
                new Person("Abby",FEMALE),
                new Person("Pam",FEMALE),
                new Person("Jules",FEMALE),
                new Person("Trudy",FEMALE),
                new Person("Theo",MALE)
        );

        people.stream()
                .map(person -> person.name )
                .collect(Collectors.toList())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name )
                .map(n -> n.length())
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }



    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    enum Gender{
        MALE, FEMALE;
    }
}
