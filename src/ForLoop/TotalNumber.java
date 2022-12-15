package ForLoop;

import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {

       int total = 0;

       Scanner scan = new Scanner(System.in);

       for (int i =0; i <5; i++){

           System.out.println("Enter your numbers");
           total+= scan.nextInt();
       }

        System.out.println(total);
    }
}
