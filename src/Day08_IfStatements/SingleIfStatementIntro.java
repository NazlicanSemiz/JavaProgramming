package Day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

// SINGLE IF ; BIR KOSUL VE BIR CIKTI
        int number = 300;

/*
        System.out.println("Odd Number"); //odd : tek

      System.out.println("Even Number"); // even : cift

 */
        boolean evenNumber =  number%2 == 0;
        boolean oddNumber = !evenNumber; // not even number

        if(evenNumber){ //even number: true yani gorunecek
            System.out.println(number + " is even number");
        }

        if(oddNumber){ //odd number : false gorunecek yani yok
            System.out.println(number +" is odd number");
        }
        System.out.println("------------------------------------");

        int n = 200;

        //postive
        if(n > 0){ // if the n is greater than zero, then its positive
            System.out.println(n + " is positive");
        }

        //negative
        if(n < 0){
            System.out.println(n + " is negative");
        }

        //zero
        if( n == 0){
            System.out.println(n + " is zero");
        }

    }
}
