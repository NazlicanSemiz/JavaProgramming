package day20_Arrays;


public class maxnumberofARRAY {
    public static void main(String[] args) {

        int[] numbers={10,5,4,20,1,0};
        int max= numbers[0]; //20


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){ // if there is element in the array thats greater than the current max number
                max= numbers[i]; // assugning greatrer number to variabla max

            }
        }

        System.out.println(max);


    }

}
