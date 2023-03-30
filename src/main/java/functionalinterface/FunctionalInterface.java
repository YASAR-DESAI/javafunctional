package functionalinterface;

interface calculate{

   int speed(int distance, int hours);

   static long timeConversion(int hrs){
        long seconds = hrs * 60 * 60 ;
        return seconds;
    }

    default long lengthConversion(int distance){
       long meters = distance * 100;
       return meters;
    }

}


public class FunctionalInterface {

    public static void main(String[] args) {

        int distance = 100;
        int hours = 10;

        calculate calculate = (d,h) -> d/h ;
        System.out.println(calculate.speed(distance,hours));

        System.out.println(calculate.lengthConversion(distance));

        System.out.println();



    }
}
