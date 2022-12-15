package day13_StringClass;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string");
        String str= scan.nextLine();
        scan.close();

        char firstChar= str.charAt(0);
        char lastChar= str.charAt(str.length()-1);

        if (firstChar==lastChar){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}

/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */