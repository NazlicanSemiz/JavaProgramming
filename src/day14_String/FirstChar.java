package day14_String;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your word");
        String word= scan.next();

        scan.close();

        char firstChar= word.charAt(0);

        if(firstChar>=48&&firstChar<=57){
            System.out.println("first character is digit");
        }else if(firstChar>=65&&firstChar<=90){
            System.out.println("first character is uppercase letter");
        }else if(firstChar>=97&&firstChar<=122){
            System.out.println("first character is lowercase letter");
        }else{
            System.out.println("first character is special character ");
        }


    }
}
/*
5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */