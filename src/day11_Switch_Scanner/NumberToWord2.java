package day11_Switch_Scanner;

public class NumberToWord2 {

    public static void main(String[] args) {
        //2. NumberToWord (0~9)

        int number = 4;
        String name ="";

        switch (number){

            case 1 :
                name =" one";
                break;

            case 2:
                name ="Two";
                break;

            case 3:
                name = "three";
                break;

            case 4:
                name = "Four";
                break;

            case 5:
                name ="Five";
                break;

            case 6:
                name ="six";
                break;

            case 7:
                name ="Seven";
                break;

            case 8:
                name ="eight";
                break;

            case 9:
                name ="nine";

            default:
                name ="Invalid";
        }

        System.out.println(name);
    }
}
