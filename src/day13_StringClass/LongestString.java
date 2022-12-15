package day13_StringClass;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        String first = "Java programming";
        String second ="Java Programming Language";

        int totalChar1= first.length();
        int totalChar2= second.length();

        if(totalChar1>totalChar2){
            System.out.println(first);
        }else{
            System.out.println(second);
        }

        System.out.println("-----------------------------------------");

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your sentence1");
        String s1 = scan.nextLine();

        System.out.println("Enter your sentence2");
        String s2 = scan.nextLine();

        int s1Lenght= s1.length();
        int s2Lenght = s2.length();

        if( s1Lenght>s2Lenght){
            System.out.println(s1 + " is the longest string");
        }else {
            System.out.println(s2 + " is the longest string");
        }


    }
}
