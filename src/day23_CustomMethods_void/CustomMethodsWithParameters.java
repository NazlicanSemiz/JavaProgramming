package day23_CustomMethods_void;

import java.security.PublicKey;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(10); // the method demands additional info to complete its task

        System.out.println();

        ageOfPerson(1996);

        printNumbers(10,50);
    }



    // create a function that can check if a number is odd number or even number

    public  static void oddOrEven(int number){

       if (number % 2== 0){
           System.out.println(number + " is even number");
       } else{
           System.out.println(number + " is odd number");
       }

    }


    // create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("You age is: " +age);

    }


    // create a function that can print all the numbers between X and Y // x10 y50
    public static void printNumbers(int x, int y){

    }

}
