package day11_Switch_Scanner;

public class DayInWeek {
    public static void main(String[] args) {

        int number=5;

        switch (number) { //1,2,3,4,5,6,7 compare ==

            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break; // this break is optional

            default: // mandatory
                System.out.println("Invalid");
                break;  // this break is optional
        }

    }
}
