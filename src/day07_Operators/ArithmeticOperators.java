package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 3;

        int division = num1 / num2; // bolum
        int remainder = num1 % num2; // kalan

        // (num1) divide by (num2) is equal to (division) a remainder of (remainder)
        // 10 bolu 3 esittir 3 kalan 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division+ " with remainder of " + remainder);

        // what is the remainder of 25 divided 4

        System.out.println( 25 % 4);
    }
}
