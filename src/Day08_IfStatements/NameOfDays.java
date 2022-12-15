package Day08_IfStatements;

public class NameOfDays {
    public static void main(String[] args) {
        /*
        2. write a program that can display the name of the day

			number = 1 ~ 7
         */
        int n = 4;
        String day;

        if (n == 1){
            day ="Monday";
        } else if (n ==2) {
            day = "Tuesday";
        } else if (n == 3) {
            day =" Wednesday";
        }else if( n == 4){
            day =" Thursday";
        } else if (n==5) {
            day =" Friday";
        } else if (n == 6) {
            day ="Saturday";
        }else {
            day =" Sunday";
        }

        System.out.println("day = " + day);
    }
}
