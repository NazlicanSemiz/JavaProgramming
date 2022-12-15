package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your string");
        String str= scan.next();

        scan.close();

        int strLength= str.length();

        if (strLength<5){
            System.out.println("Too short!");
        } else if (strLength>5) {
            System.out.println("Too long!");
        }else {
            System.out.println(" " + str.charAt(4) + str.charAt(3) + str.charAt(2) +
                    str.charAt(1) + str.charAt(0));
        }

    }
}

/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.


 */