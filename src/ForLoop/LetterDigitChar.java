package ForLoop;

public class LetterDigitChar {
    public static void main(String[] args) {

        String str= "ABCD123#$@!";

        String digits= "";
        String leters= "";
        String chars= "";

        for (int i=0; i< str.length(); i++) {


            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                leters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                leters += ch;
            } else {
                if (ch != ' ') {
                    chars += ch;
                }
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + leters);
        System.out.println("chars = " + chars);
    }
}
/*
 5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */