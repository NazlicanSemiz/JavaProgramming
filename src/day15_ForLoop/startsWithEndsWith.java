package day15_ForLoop;

public class startsWithEndsWith {
    public static void main(String[] args) {

        String a= "Wooden Spoon";

        System.out.println(a.startsWith("Woo")); //true

        System.out.println(a.endsWith("Spoon")); //true

        System.out.println(a.toLowerCase().startsWith("wooden"));
    }
}
