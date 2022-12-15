package day13_StringClass;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string");
        String str= scan.next();

        scan.close();

        int length = str.length();

        if (length==0){
            System.out.println("string is empty");
        } else if (length>3) {
            System.out.println("" + str.charAt(length - 3)
                    + str.charAt(length - 2) + str.charAt(length - 1));
        }else if (length<3){
            System.out.println(str);
        }

    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */