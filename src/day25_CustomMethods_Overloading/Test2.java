package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};

        ArraysUtility.printEach(arr1);

        System.out.println("-----------------");

        double[] arr2= {1.5,2.5,3.5,4.5};

        ArraysUtility.printEach(arr2);

        System.out.println("-----------------");

        char[] arr3= {'a','b','c','d'};

        ArraysUtility.printEach(arr3);

        System.out.println("-----------------");

        String [] names= {"nazli","cilve"};

        ArraysUtility.printEach(names);

        System.out.println("----------------");

        int[] n1= {1,2,3,4,5,6};

        int max1= ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("------------------");

        double[] n2= {2.3,5.2,6.4};

        double max2= ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);

        System.out.println("-----------------");

        int[] a1= {1,2,3,4,5};

        boolean r1= ArraysUtility.contains(a1,5);

        System.out.println("r1 = " + r1);

    }
}
