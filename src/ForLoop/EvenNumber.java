package ForLoop;

public class EvenNumber {
    public static void main(String[] args) {

        double sum = 0;

        for (int i=0; i<=101;i+=2){
           sum += i;
        }

        System.out.println(sum);

    }
}
/*
1. Write a program that can return the sum of even numbers between 1 to 100
 */