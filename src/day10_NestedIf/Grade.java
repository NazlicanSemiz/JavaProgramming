package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';
        String result = " ";

        if ((grade >= 'A' && grade <= 'D') || grade == 'F') {

            if (grade == 'A') {
                result = "Excellent";
            } else if (grade == 'B') {
                result = "great job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            } else {
                result = "Failed";
            }

        }else{
            result="Invalid grade";
        }
        System.out.println(result);
    }
}

/*
3. Create a class called Grade, a char variable named grade is given.
 write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */