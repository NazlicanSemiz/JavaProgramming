package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,5,6,7};

        int[] unique=uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        //------------------------------------
        double[] array2= {1.2,2.5,6.4,2.6};

        double[] unique2 =uniqueElements(array2);

        System.out.println(Arrays.toString(array2));

        //----------------------------------------

        char[] array3= {'a','b','b','c','n'};

        char[] unique3= uniqueElements(array3);

        System.out.println(Arrays.toString(array3));

        //-----------------------------------------

        String [] array4= {"nazli","cilve","kedi","kedi"};

        String[] unique4= uniqueElements(array4);
        System.out.println(Arrays.toString(array4));

    }

    // returms the unique elements of the array as a new array
    public static  int[] uniqueElements(int[] array){
        int[] result={};

        for (int each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is 1, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return  result;
    }


    // returms the unique elements of the array as a new array
    public static  double[] uniqueElements(double[] array){
        double[] result={};

        for (double each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is 1, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return  result;
    }


    // returms the unique elements of the array as a new array
    public static  char[] uniqueElements(char[] array){
        char[] result={};

        for (char each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is 1, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return  result;
    }


    // returms the unique elements of the array as a new array
    public static  String[] uniqueElements(String[] array){
        String[] result={};

        for (String each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is 1, the elements is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return  result;
    }


}
