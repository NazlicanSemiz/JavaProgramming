package Day08_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {
        /*
        1. write a program that can display the name of the month

			number = 1 ~ 12

         */
        int number = 12;

        if (number == 1){
            System.out.println("Jan");
        } else if (number==2) {
            System.out.println("Feb");
        } else if (number==3) {
            System.out.println("Mar");
        } else if (number==4) {
            System.out.println("Apr");
        }else if (number==5){
            System.out.println("May");
        } else if (number==6) {
            System.out.println("Jun");
        } else if (number== 7) {
            System.out.println("Jul");
        } else if (number==8) {
            System.out.println("Aug");
        } else if (number==9) {
            System.out.println("Sep");
        }else if (number==10){
            System.out.println("Oct");
        }else if (number==11){
            System.out.println("Nov");
        }else {
            System.out.println("Dec");
        }



    }
}
