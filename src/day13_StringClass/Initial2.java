package day13_StringClass;

import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        input.close();

        char firstChar = firstName.charAt(0);
        char lastChar = lastName.charAt(0);

        String initial = firstChar + "."+ lastChar;

        System.out.println(initial);

    }
}

/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */