package taskpracticewith_sevde;

public class task16_4 {
    public static void main(String[] args) {

String sentence ="Java Java Java";

    int frequancy= 0;

        for (int i = 0; i <= sentence.length()-4; i++) {
        String eachJava = sentence.substring(i,i+4);


        if (eachJava.equals("Java")){
            frequancy++;
        }
    }

        System.out.println(frequancy);
}

}

/*

4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */