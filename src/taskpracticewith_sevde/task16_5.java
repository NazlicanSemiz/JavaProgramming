package taskpracticewith_sevde;

public class task16_5 {
    public static void main(String[] args) {

        String sentences = "Cat Cat Cat Dog Dog";

        int freq=0;

        for (int i = 0; i < sentences.length()-3; i++) {
            String eachCat= sentences.substring(i,i+3);

            if (eachCat.equals("Cat")){
                freq++;
            }
        }
        System.out.println(freq);
    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */