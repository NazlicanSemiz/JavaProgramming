package day15_ForLoop;

public class SumOfNumber {
    public static void main(String[] args) {

        double sum = 0;
        // 1+2+3+...100

        for (int i = 1; i <101 ; i++){ // i= 1 2 3 4 5 ...100
            sum += i;
        }

        System.out.println(sum);

    }
}
/*
3. Write a program that can calculate the sum of all integers between 1 to 100
 */