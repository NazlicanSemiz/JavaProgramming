package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

         /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */

        int score =95;

        if (score >= 0 && score <= 100) { // if the score is valid
            // 5 posibilities; A,B,C,D,F
            if(score >= 90 && score <= 100){
                System.out.println("Excellent");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Great");
            } else if (score >=70 && score<= 79) {
                System.out.println("Good");
            } else if (score>=60 && score<=69) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }


        }else{ // if the score is not valid
            System.out.println("Invalid score");
        }


        System.out.println("--------------------------------------");
// int score =95;
        String result = " ";

        if (score >= 0 && score <= 100) {

            if(score >= 90){
               result = "Excellent";
            } else if (score >= 80) {
               result = "Great";
            } else if (score >=70) {
                result = "Good";
            } else if (score>=60 ) {
               result ="Passed";
            }else {
                result = "Failed";
            }

        }else{ // if the score is not valid
            result = "Invalid score";
        }

        System.out.println("result = " + result);


    }
}
