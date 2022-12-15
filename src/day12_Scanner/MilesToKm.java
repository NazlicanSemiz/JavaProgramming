package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter kilometer(km): ");

        double km= scan.nextDouble();
        scan.close();

        double mile= km * 1.609344;

        System.out.println( km+ " kilometers equal to "+ mile+" miles.");

    }
}

/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */