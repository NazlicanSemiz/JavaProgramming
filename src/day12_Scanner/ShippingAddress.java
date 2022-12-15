package day12_Scanner;

import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //ENTER

        System.out.println("Enter your full name:");
String fullName =  scan.nextLine(); // javaenter

        System.out.println("Enter your Building number");
String building = scan.next(); //3525A

        scan.nextLine();

        System.out.println("Enter your Street name");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name:");
        String state= scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

scan.nextLine();
        System.out.println("enter your countrt name:");
String country = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

    }
}


/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */
