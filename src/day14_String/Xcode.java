package day14_String;

import java.util.Scanner;

public class Xcode {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();

        scan.close();

       String result ="";
        if (word.startsWith("x") || word.startsWith("X")){
            result=word.substring(1, word.length());
        }

        System.out.println(result);

    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */