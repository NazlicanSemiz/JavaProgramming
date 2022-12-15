package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility_copyOfRange {
    public static void main(String[] args) {

        char[] ch1 ={'A','B','C','D','E','F','G','H','I'};
        char[] ch2= Arrays.copyOfRange(ch1,2,6+1); // c and g arasi +1lersen gyi de dahil eder

        System.out.println(Arrays.toString(ch2));



        int[] scores={10,20,30,40,50,60,70,80,90,100};
        //index= 0 1 2...
       // int[]  result = Arrays.copyOfRange(scores,3,7+1); ikiside ayni
        int[]  result = Arrays.copyOfRange(scores,3,8);

        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores, 3, scores.length);

        System.out.println(Arrays.toString(result2));


    }
}
