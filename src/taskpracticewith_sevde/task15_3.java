package taskpracticewith_sevde;

import java.util.Scanner;

public class task15_3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter a number");
        int num= input.nextInt();

        int sum=0;
        for (int i = 1; i <num ; i++) {
            sum+=i;
        }
        System.out.println(sum);



    }
}
