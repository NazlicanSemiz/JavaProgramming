package day13_StringClass;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your tgree letter word");
        String str = scan.next();

        scan.close();

        int length= str.length();
        char middle= str.charAt(1);//012

        if (length==3) {


            if (middle == 'a') {
                System.out.println("Cool word");
            } else if (middle != 'a') {
                System.out.println("Okay word");
            }
        } else{
            if (length>3){
                System.out.println("Word too long");
            }else  {
                System.out.println("Word is too hort");

            }
        }


    }
}
/*
. write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word",
but in the case the middle letter is not 'a' print: "Okay word".

     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */