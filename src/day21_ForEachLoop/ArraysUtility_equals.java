package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility_equals {
    public static void main(String[] args) {

        int[] arr1= {1,3,2};
        int[] arr2= {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1); // false

        Arrays.sort(arr1); //1,2,3
        Arrays.sort(arr2); //1,2,3

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2); // true



        System.out.println("-------------------------------------------------------");

        //"acb", "bac"
        char[] ch1 = {'a','c','b'};
        char[] ch2= {'b','a','c'};

        Arrays.sort(ch1); // a,b,c
        Arrays.sort(ch2); // a,b,c

        boolean anagram= Arrays.equals(ch1,ch2);

        System.out.println(anagram); //true


    }
}
