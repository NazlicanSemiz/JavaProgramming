package taskpracticewith_sevde;

public class task15_8 {
    public static void main(String[] args) {

        String word = "Anna";

        int lenght= word.length();

        for(int i= lenght-1; i >=0; i--){
            System.out.print(word.charAt(i));
        }

        boolean isPalindrome = word.equalsIgnoreCase(word);
        System.out.println("isPalindrome = " + isPalindrome);

    }
}

/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */