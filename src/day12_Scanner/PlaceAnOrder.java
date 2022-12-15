package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your product name: ");
        String productname= scan.nextLine();

        System.out.println("Enter the price: ");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter their first name: ");
        String name= scan.nextLine();

        System.out.println("productname = " + productname);
        System.out.println("price = " + price);
        System.out.println("quantity = " + quantity);
        System.out.println("name = " + name);

        scan.close();

        double total = price*quantity;

        System.out.println(name + ", your order for " + quantity+ " has been placed. Your total is $" + total);
    }
}
/*
6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.


 */