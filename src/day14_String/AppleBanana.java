package day14_String;

import java.util.Scanner;

public class AppleBanana{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first word");
String first= scan.next();

        System.out.println("Enter your second word");
        String second= scan.next();

        scan.close();

 first=first.substring(1);
 second=second.substring(1);

        System.out.println(first);
        System.out.println(second);

    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
