package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        // 15 16 17...45

        for (int i = 15; i<=45 ; i+=1){
            System.out.println("i = " + i);
        }

        /*
       for (int i = 15; i<=45 ; i++){
            System.out.println("i = " + i);
        }

        for (int i = 15; i<=45 ; i++){
            System.out.println(i + " "); // or alt alta olmasi icin parantez icine \n
           */

        // 100 99 98....50

        for (int i = 100; i>=50; i--){
            System.out.println(i);
        }

        // print all the even numbers between 1~55

        for (int i=1; i<=55; i++){
            if (i % 2==0){
                System.out.println(i);
            }
        }

        //    OR

        for (int i = 2; i <= 54 ; i += 2){  // 2 4 6 ,,,54
            System.out.println(i);
        }


    }
}
