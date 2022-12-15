package day12_Scanner;

import  java.util.Scanner;
public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
     int age = input.nextInt(); // 19enter

       input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //enter

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
    }
}

/*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */
