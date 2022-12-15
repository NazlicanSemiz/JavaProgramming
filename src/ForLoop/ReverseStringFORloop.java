package ForLoop;

public class ReverseStringFORloop {
    public static void main(String[] args) {

        String word= "Wooden Spoon";

        int lenght= word.length();

        for (int i=lenght-1; i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
}
/*
7. Write a program that can reverse any given string

        Ex:
        input:
        Wooden Spoon

        output:
        noopS nedooW

 */