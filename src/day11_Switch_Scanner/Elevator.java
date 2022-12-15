package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {

        int floatNumber = 2;
        String result = "";


            if (floatNumber == 1) {
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floatNumber == 2) {
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            } else if (floatNumber==3){
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }else{
                System.out.println("Invalid floor - 6");
            }


        System.out.println(result);

        System.out.println("-------------------------------------------------");

switch (floatNumber){
    case 1:
        result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
        break;

    case 2:
        result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
        break;

    case 3:
        result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
        break;

    default:
        result="Invalid floor - 6";
}

        System.out.println(result);

        System.out.println("--------------------------------------------");

        if (floatNumber==1 || floatNumber==2 || floatNumber==3){

            switch (floatNumber){
                case 1:
                    result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;

                case 2:
                    result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;

                default:
                    result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else {
            result="Invalid floor - 6";
        }

        System.out.println(result);


    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is given,
write a program that can display the floor info

when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

		anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */