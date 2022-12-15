package day13_StringClass;

import java.lang.String;


public class StringIntro {
    public static void main(String[] args) {


        String name = "Wooden spoon";
        String name2= "Wooden spoon"; // because there in pool
        String name3= "Wooden spoon";
        String name4= "Wooden spoon";

        System.out.println(name == name2); //true
        System.out.println( name2 == name3); //t
        System.out.println(name3== name4); // t


        System.out.println("-----------------------");

        String str1 =  new String( "Wooden spoon"); // cause there in heap
        String str2 =  new String( "Wooden spoon");
        String str3 =  new String( "Wooden spoon");
        String str4 =  new String( "Wooden spoon");


        System.out.println(str1 == str2); //false
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println("--------------------------");

        String s1 = "Java";
        String s2= new String("Java");

        System.out.println(s1.equals(s2)); // that's mean s1 == s2  //TRUE

        String s3 ="Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4)); // False harf buyuk kucuklugu


    }
}
