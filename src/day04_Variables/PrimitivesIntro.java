package day04_Variables;

public class PrimitivesIntro {
    /*
    primitives:
int: for integers
double: for decimals
char: for single characters, ''
boolean: true/false

 String: sequence of characters (String of text), ""

 variable naming rules:
1. MUST be unique
2. camelCase
3. Can Not start with digits
4. starts with lower case letters
5. Can Not be Java Reserved words
6. Can Not have special characters other than _ and $
7. readable, understandable

 How to replace variable names?
1. Ctrl (Command) + R
2. type old variable name
3. type new variable name
4. click Replace All

quantity = 3;   quantity: variable name / =: assigment operator / 3: variale value

•The first character must be one of the letters a - z or A - Z, an underscore ( _ ), or a
dollar sign ( $ )

•After the first character, you may use letters a - z or A - Z, the digits, underscore ( _ ) or
dollar sign ( $ )

ctrl = R : you change rename your variable
 */

    public static void main(String[] args) {
        //numerical primitives:
        //double > float > long > int
        //> short > byte

        // age: 38 years old
        byte age = 38;

        // weight: 160
        // byte weight = 160; it gives error cause 160> 127 so byte' teypes: out of byte range
        // byte num = -129: error cause out of byte' range

        short weight = 160; // its right cause within the range of short

        // salary : 100000 ?
        //short salary = 100000; // error : 100000 is out of the short' ranges

        int salary = 100_000; // within the range of int

        //int asset = 3_333_333_333; // asset: varlik no' its so long

        long asset = 3_333_333_333L; // hala cok uzun ' uzun olanlara L koymalisin

        //tax: 0.26

        float tax = 0.26F;
        double PI = 0.26;

        //#
        char ch1 = '#'; // karakterde tek tirnak isareti ve sadece singal karakter

        System.out.println("ch1 = " + ch1);

        char ch2 = 35;

        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 4;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';
        char yesNo = 'Y';

        System.out.println("yesNo = " + yesNo);
        System.out.println("gender = " + gender);

        // char ch5 = 'ab'; // unclosed character error
        // System.out.println("ch5 = " + ch5);

        boolean isEmployeed = true;
        boolean isMarried = true;

        boolean result = 100 > 300;

        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("result = " + result);


        String name = "Wooden Spoon";
        String city = "London";

        System.out.println("name = " + name);
        System.out.println("city = " + city);

        String first_name$ = "Nazli";
        int num1=100;
        int num2=200;

        //int private=300;  private+java words





    }
}
