package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b=20,
                c=30;
        // if we have three different numbers, one MUST maximum, one MUST be minimum and one MUST be Median


        boolean aIsMedian = ( a>b && a<c) || ( a > c && a < b);
        /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */

        boolean bIsMedian = ( b > c &&  b < a) || (b > a && b < c);
         /*
        in order of b to be the median number:
         */

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a + " could be median number");
        }

        if (bIsMedian){
            System.out.println(b + " could be median number");
        }

        if (cIsMedian){
            System.out.println(c +" could be median number");
        }

    }
}

/*
2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers

Ex:
a = 10, b= 15, c = 20;

Output:
15 is the median number

Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
 */