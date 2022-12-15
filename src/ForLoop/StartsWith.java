package ForLoop;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {

        System.out.println("Enter a word"); //xcode print
        String word = new Scanner(System.in).next();

        if (word.startsWith("x")){
            System.out.println(word.replaceFirst("x", "a"));
        }




    }
}
/*
1. Write a program that asks user to enter a word. If the work
starts with x, replace it with a.
Input:
xcodex
Output:
acodex
 */