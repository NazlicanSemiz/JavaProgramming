package taskpracticewith_sevde;

public class task16_2 {
    public static void main(String[] args) {

        String str = "aabbccde";
        char ch= 'c';

        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (ch == eachChar){
                frequency ++;
            }

        }
        System.out.println(frequency);

    }
}

/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */