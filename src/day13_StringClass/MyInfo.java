package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        /*
        1. Create a class called MyInfo. Write a program that can ask the
user to:
1. Enter your age (int)
2. Enter your gender (String- One word ONLY)
3. Enter your full name (String- Multiple
words)
4. Enter your phone number (long)
5. Enter your zip code (int)
6. Enter your School name (String- Can be
Multiple words)
7. Enter your city name (String- Can be
Multiple words)
8. Enter your state name (String- One word
ONLY)
9. Enter your building number (int)
10. Enter your Street name
MAKE SURE USER CAN ENTER ALL THE INPUT
Display all the inputs that user entered in following
order in sperate lines:
1. full name
2. age
3. gender
4. phone number
5. address:
buildingNumber
Street
City, State
ZipCode
6. school name
         */

        Scanner scan= new Scanner(System.in);

        System.out.println(" Enter your age:");
        int age= scan.nextInt();

        System.out.println("Enter your gender;");
        String gender= scan.next();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullNae = scan.nextLine(); // if the previous scanner method that's used is not nexline' then we need provide one more netxline method

        System.out.println("Enter your phone number");
long phone= scan.nextLong();

        System.out.println("enter your zip code:");
int zipCode= scan.nextInt();

scan.nextLine();

        System.out.println("enter your school name:");
        String schoolName= scan.nextLine();

        System.out.println("Enter your city name:");
        String city = scan.nextLine();

        System.out.println("enter your state name:");
        String state= scan.next();

        System.out.println("Enter your building name:");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("enter your street name:");
        String street= scan.nextLine();

        scan.close();

        System.out.println("fullNae = " + fullNae);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("Address: \n\t" + building+ " " +street+"\n\t"+city+" ,"+zipCode);
        System.out.println("schoolName = " + schoolName);


    }
}
