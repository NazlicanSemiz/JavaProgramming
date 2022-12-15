package LoopBranching_Break_Continue;


public class Intro {
    public static void main(String[] args) {

        // Break Statement: exits the loop

        for (char i = 'A'; i<= 'E'; i++){

            System.out.println(i);

            if ( i == 'C'){
            break; // interrupted at character C and does not write the rest of C
            }

        }

        System.out.println("-------------------------------------------------");

        for ( int i =1; i <=5; i++){
            System.out.println(i);
            if (i ==3){
                break; // interrupted at number 3 and does not write the rest of 3
            }
        }


        // Continue Statement:

        for (char i = 'A'; i<= 'E'; i++){
            if (i== 'C'){
              //  break; // does not write rest of the C but we wanna print A B D E
                continue; // i can do that by Continue statement
            }
            System.out.println(i);

        }



    }
}
