package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods_split {
    public static void main(String[] args) {

        String  sentence= "Wooden Spoon";

       String[] words=  sentence.split(" ");

        System.out.println(Arrays.toString(words));


        //****************************************

        String email = "WoodenSpoon@cydeo.com";

        String[] arr= email.split("@");

        System.out.println(Arrays.toString(arr));

     // ******************************************

        String s= " Cilve came back at home, I am very happy for that";

        String[] sentences= s.split("\\.  ");
        System.out.println(Arrays.toString(sentences));




    }
}
