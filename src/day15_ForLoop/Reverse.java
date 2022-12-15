package day15_ForLoop;

public class Reverse {
    public static void main(String[] args) {

        String str= "Java";

        int length= str.length();

        for (int i=length-1; i>=0; i--){
            System.out.println(str.charAt(i));
        }

    }
}
/*
1. Write a program that can reverse any given string

            String str = "Java"; ==> avaJ
         //              0123
 */