package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n%2 == 0){
            System.out.println("Even"); //string
        } else{
            System.out.println("Odd"); // string
        }

        System.out.println("---------------------------------");

        String result1 = (n%2 == 0)? "Even" : "Odd" ;

        System.out.println(result1);

        System.out.println("----------------------------------------");

        int age = 23;

       /*
        if(age >= 21){
            System.out.println("Eligible"); //string
        } else{
            System.out.println("NOT eligible"); //string
        }
        */

        // System.out.println((age >=21) ? "Eligible" : "Not eligible") ;

 String result2 = (age >=21) ? "Eligible" : "Not eligible";
        System.out.println(result2);

        // 3 farkli sekilde de ifli yazabilirsin

        System.out.println("-------------------------------");

        int number =100;

        /*
        if(number>0){
            System.out.println("Positive"); //string
        } else if (number<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
*/
       // System.out.println((number>0)? "positive" :(number<0)? "negative" : "zero");

       String result3= (number>0)? "positive" :(number<0)? "negative" : "zero";
        System.out.println(result3);


    }
}
