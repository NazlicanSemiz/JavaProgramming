package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;

        if( score >=0 && score <=100) { // if score is valid

            if (score >= 60) { // if student passed the exxam
                System.out.println("Passed");
            } else { // if the student failed exam
                System.out.println("Failed");
            }

        }else{// if the score is not valid
            System.out.println("Invalid score");
        }
        System.out.println("------------------------------------------------");

        int age = 25;
        boolean hasId= true;

if(hasId) { // if the person has an ID
    if (age >= 21) {
        System.out.println("Eligible to buy alcohol");
    } else {
        System.out.println("Not eligible to buy alcohol");
    }

} else { // If the person does not hav an ID
    System.out.println("You must have an ID to buy alcohol");
}


        System.out.println("---------------------------------------------");

int number = 7 ;

if (number >= 1 && number<=7){ // if the number is a valid number (1-7)

    if (number==1){
        System.out.println("monday");
    } else if (number==2) {
        System.out.println("tuesday");
    } else if (number==3) {
        System.out.println("wednesday");
    } else if (number==4) {
        System.out.println("thursday");
    } else if (number==5) {
        System.out.println("friday");
    } else if (number==6) {
        System.out.println("saturday");
    } else {
        System.out.println("sunday");
    }
    // 7 options

}else{ // if the number is noy valid
    System.out.println("Invalid number");

}


    }
    }