package ForLoop;

public class ReverseFORLoop {
    public static void main(String[] args) {

        String str= "Java";
        //           0123

        int lenght= str.length();

        for (int i =lenght-1; i>=0;i-- ){
            System.out.print(str.charAt(i));
        }

    }
}
/*
1. Write a program that can reverse any given string

            String str = "Java"; ==> avaJ
         //              0123
 */