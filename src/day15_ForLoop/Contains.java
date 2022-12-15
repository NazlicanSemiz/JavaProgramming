package day15_ForLoop;


public class Contains {
    public static void main(String[] args) {

        String sentence= "My favorite thing is Cilve";

        boolean hasCSharp= sentence.contains("Cilve");
        System.out.println(hasCSharp); //true

        System.out.println(sentence.contains("nazli")); //false
        System.out.println(sentence.contains("cilve")); // false


        String input = "jAvA";

        System.out.println(input.toLowerCase().contains("java")); // true
        System.out.println(input.toUpperCase().contains("JAVA")); //TRUE



    }
}
