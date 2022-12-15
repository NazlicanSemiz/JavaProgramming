package day09_IfStatements;

public class MinMaxNumber {
    public static void main(String[] args) {
        /*
        1. Maximum number between two different numbers
		2. Minimum number between two different numbers
         */

        int a = 5,
                b=14;

        if (a<b){
            System.out.println( a + " is Minimum number");
        } else {
            System.out.println(b + " is Maximum number");
        }

        System.out.println("------------------------");

        int c = 10,
                d=17;

        if (c>d){
            System.out.println( c + " is Minimum number");
        } else {
            System.out.println( d + " is Maximum number");
        }
    }
}
