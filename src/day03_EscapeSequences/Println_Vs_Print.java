package day03_EscapeSequences;

public class Println_Vs_Print {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");
        System.out.println("How are you all today?");

        System.out.println("----------------------------");

        System.out.print("Hello Cydeo");
        System.out.print("How are you all today?");

        System.out.println("Java Programming");

        System.out.print("Wooden Spoon");
        // eger print() ile yazdiysam ve bi sonraki printl() ile yazacagim kodum ayri olsun istiyorsam
        // ptintl() yapip bosluk ver
        System.out.println();
        System.out.println("I love Java");
        System.out.println("---------------");

        System.out.println("Hello everyone? How are you all today? Today we will learn Escape Sequences and next week we will learn Variables.");
        System.out.println("----------");

        System.out.print("Hello everyone? How are you all today?");
        System.out.print("Today we will learn Escape Sequences");
        System.out.print("and next week we will learn Variables.");

        System.out.println();


    }
}

