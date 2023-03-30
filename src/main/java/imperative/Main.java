package imperative;

import com.sun.tools.attach.AgentInitializationException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("Jim", MALE),
                new Person("Abby",FEMALE),
                new Person("Pam",FEMALE),
                new Person("Jules",FEMALE),
                new Person("Trudy",FEMALE),
                new Person("Theo",MALE)
        );

        //Imperative approach to count number of females.

        List<Person> females = new ArrayList<>();
        List<Person> males = new ArrayList<>();

        for(Person person: people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for( Person female : females){
            System.out.println(female);
        }

        //Declarative approach to print females
        System.out.println("Using Declarative approach: ");

        people.stream().filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        Predicate<Person> predicatePerson = person -> MALE.equals(person.gender) ;

        System.out.println("Printing all the males");
        people.stream().filter(predicatePerson).forEach(System.out::println);
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
