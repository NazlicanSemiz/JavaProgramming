package taskpracticewith_sevde;

public class task15_1 {
    public static void main(String[] args) {
        //1. Write a program that can return the sum of even numbers between 1 to 100

        double sum=0;

        for (int i = 0; i <= 101; i+=2) {
            sum+=i;
        }
        System.out.println(sum);
    }

}
