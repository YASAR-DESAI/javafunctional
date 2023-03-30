package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        consumerFunction.accept(new Customer("Theo", "66666"));
        biConsumerFunction.accept(new Customer("Steve", "89889"),false);

    }

    static Consumer<Customer> consumerFunction = customer ->
            System.out.println("Name: "+customer.name + "Mobile: "+customer.phoneNumber);

    static BiConsumer<Customer, Boolean> biConsumerFunction = (customer,displayNumber) ->
            System.out.println("Name: "+ customer.name +
                    "Mobile: "+(displayNumber ? customer.phoneNumber : "*****"));

   static class Customer{

        String name;
        String phoneNumber;

        public Customer(String name , String phoneNumber){

            this.name = name;
            this.phoneNumber = phoneNumber;

        }


    }

}
