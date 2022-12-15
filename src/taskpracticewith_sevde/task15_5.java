package taskpracticewith_sevde;

public class task15_5 {
    public static void main(String[] args) {

        String str="mn@#123Ab!";

        String digits="";
        String letter="";
        String specialChar= "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <='9'){
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letter += ch;
            } else if (ch >='a' && ch <= 'z') {
                letter += ch;
            }else{
                specialChar+=ch;
            }

        }
        System.out.println("specialChar = " + specialChar);
        System.out.println("digits = " + digits);
        System.out.println("letter = " + letter);


    }
}
/*
 5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */