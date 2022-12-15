package day15_ForLoop;

public class IsEmptyIsBlank {
    public static void main(String[] args) {

        String str = " "; // space also a character
        String str2= "java";
        String str3= "";

        boolean r = str.isEmpty();
        System.out.println(r);  //false
        System.out.println(str2.isEmpty());  //false
        System.out.println(str3.isEmpty()); //true

        boolean r1 =  str.isBlank(); // if you have not any char this is blank
        System.out.println(r1); //true

        String str4= "Cydeo   ";
        System.out.println(str4.isBlank()); //false
    }
}

/*

 */