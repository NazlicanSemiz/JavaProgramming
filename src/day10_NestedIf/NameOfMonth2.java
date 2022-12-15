package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
 int n = 5;

 String result =  (n==1)? " jun" :(n==2)? " feb" :(n==3)? "mar" :(n==4)? "apr" :(n==5)?
         " may" :(n==6)? "jun" :(n==7)? "jul" :(n==8)? "aug" :(n==9)? "sep" :(n==10)? "oct"
         :(n==11)? "nov" : "dec";
 // () leri yazmayabilirsin n==1? gibi

        System.out.println(result);


    }
}
