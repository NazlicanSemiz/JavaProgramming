package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str= "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("------------------------------------");

        String s1= "Cilve Nazli";

       String reverse= StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("==================");

String word= "Cilve";

boolean pan= StringUtility.isPalindrome(word);
        System.out.println(pan);

        System.out.println("------");

        String[] names= {"nazli","cilve","mom"};

        int count=0;

        for (String each: names){

            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("===========");

        String s2= "aaaaaaaabbbbbbbbccccccdddddddd";

        String nonDup=StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);

    }
}
