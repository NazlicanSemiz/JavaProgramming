package taskpracticewith_sevde;

public class task15_2 {
    public static void main(String[] args) {

       // 2. Write a program that can return the sum of odd numbers between 1 to 100

        double sum=0;

        for (int i = 1; i <=100 ; i+=2) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
