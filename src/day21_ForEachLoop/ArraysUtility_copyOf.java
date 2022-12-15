package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility_copyOf {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers, 4); //{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));


    }
}
