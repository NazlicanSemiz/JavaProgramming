package day13_StringClass;

public class Sentences {
    public static void main(String[] args) {

String sentence= "Nazli has a cat";

char firstChar = sentence.charAt(0);
System.out.println("firstChar = " + firstChar);

        char lastChar = sentence.charAt(sentence.length()-1);
        System.out.println("lastChar = " + lastChar);

    }
}

/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */