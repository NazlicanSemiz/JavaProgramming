package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int number = 7;
        String result = (number >= 0 && number <= 9) ?

                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 3) ? "Three"
                        : (number == 4) ? "Four" : (number == 5) ? "Five"
                        : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight"
                        : "Nine"

                : "Invalid number";

        System.out.println(result);

    }
}

       // if (number>=0 && number<=9){ nested if deki gibi stringte yazabilirsin kisaltmayla
        //}

/*
2. Write a program that can convert numbers 0~9 to words.
NOTE: MUST use ternary
 */