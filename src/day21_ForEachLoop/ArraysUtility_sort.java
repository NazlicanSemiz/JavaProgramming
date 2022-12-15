package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility_sort {
    public static void main(String[] args) {

        int[] scores= {95,100,55,65,85,78};

        Arrays.sort(scores); // {55 to 100}

        System.out.println(Arrays.toString(scores));

        // Min Max

        System.out.println(" Min score:" + scores[0]);
        System.out.println(" Max score:" + scores[scores.length-1]);



        String[] names= {"Nazli","Cilve","Cat","Mustafa"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names)); // alfabeye gore



        String[] words={"Anna","ANNA"}; // upper case number in ascii table 65, lower case 97

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

    }
}
