package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first string");
        String first= scan.next();

        System.out.println("enter your second string");
        String second= scan.next();

        System.out.println("enter your third string");
        String third= scan.next();

        scan.close();

        int firstLength= first.length();
        int secondLenght= second.length();
        int thirdLenght= third.length();

        if (firstLength==secondLenght && firstLength==thirdLenght){
            System.out.println("All words are same length");
        } else if (firstLength== secondLenght && firstLength!=thirdLenght) {
            System.out.println("Not Same nor Different lengths");
        } else if (firstLength!=secondLenght && firstLength!=thirdLenght &&secondLenght!=thirdLenght) {
            System.out.println("All different length");
        }


    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */