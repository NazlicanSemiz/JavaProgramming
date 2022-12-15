package day14_String;

import javax.swing.*;
import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String one = scan.next();

        System.out.println("Enter second word");
        String two = scan.next();

        scan.close();
String together = one+two;
        System.out.println(together);

if (one.charAt(one.length()-1)== two.charAt(0)){
    System.out.println(one + two.substring(1));
}

    }
}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is
    the same,  print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */