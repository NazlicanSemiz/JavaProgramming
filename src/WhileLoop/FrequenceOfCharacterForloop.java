package WhileLoop;

public class FrequenceOfCharacterForloop {
    public static void main(String[] args) {

        String str= "AABBCC";
        char ch= 'A';

        int frequency= 0;

        for (int i =0; i <str.length(); i++){
            char eachChar= str.charAt(i);

            if (ch==eachChar){
                frequency++;
                // or you can write frequency+=1;
            }
        }
        System.out.println(frequency);
    }
}
/*
1. Write a program that can return the frequency of a char from a
String
Ex:
str = "AAABBBC"
ch = 'A'
Output:
3
 */