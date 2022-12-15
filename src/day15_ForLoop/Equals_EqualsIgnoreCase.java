package day15_ForLoop;

public class Equals_EqualsIgnoreCase {
    public static void main(String[] args) {

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println( "yEs".equals("Yes")); //false
        System.out.println( "yEs".equalsIgnoreCase("Yes")); //true

    }
}
