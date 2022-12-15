package day15_ForLoop;

public class SumOfOddNumber {
    public static void main(String[] args) {

        double sum=0;

        for (int i=1; i<=100; i+=2){
           sum += i;
        }
        System.out.println(sum);

        /*
        int sum = 0;

        for(int i=0; i <= 100; i++){
            if(i%2!=0){
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
         */
    }
}
/*
2. Write a program that can return the sum of odd numbers between 1 to 100

 */