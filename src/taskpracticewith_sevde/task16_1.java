package taskpracticewith_sevde;

import java.util.Scanner;

public class task16_1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter five number");

        int pos=0;
        int neg=0;

        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();

            if (num >0){
               pos ++; // ++ ile +=1 ayni sey
            } else if (num <0) {
                neg ++;
            }else{
                System.out.println("number is neutral");
            }
        }

        System.out.println("There ara" + pos + " positive, " + neg +" negative numbers");

scan.close();



    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */