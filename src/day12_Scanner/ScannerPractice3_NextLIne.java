package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLIne   {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //enter

        System.out.println(" Enter your full  name: ");
        String fullName = input.nextLine(); // Wooden SpoonENTER

        System.out.println("Enter your programming language");
        String programming = input.nextLine();

        System.out.println("Enter your age: ");
        int age= input.nextInt(); //24enter

        input.nextLine(); //enter

        System.out.println("Enter your school name:");
        String schoolName= input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}

