package day11_Switch_Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String size ="grande";
        String result= "";

        if(size=="tall" || size=="grande" || size=="venti"){

            if (size=="tall"){
                result="price is $3.69\n90 calories";
            } else if (size=="grande") {
                result="price is $3.99\n120 calories";
            }else{
                result="price is $4.29\n150 calories";
            }

        }else{
            result="Invalid Size";
        }

        System.out.println(result);

        System.out.println("-------------------------------------");


        switch (size){
            case "tall":
                result="price is $3.69\n90 calories";
                break;

            case "grande":
                result= "price is $3.99\n120 calories";
                break;

            default:
                result="price is $4.29\n150 calories";
        }

        System.out.println(result);

        System.out.println("---------------------------");

        if(size=="tall" || size=="grande" || size=="venti"){

            switch (size){
                case "tall":
                    result="price is $3.69\n90 calories";
                    break;

                case "grande":
                    result="price is $3.99\n120 calories";
                    break;

                default:
                    result="price is $4.29\n150 calories";
            }

        }else {
            result="Invalid size";
        }

        System.out.println(result);

    }
}
/*
	1. Create a class called  CappuccinoBuyer. A variable named Size is given,
	 write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */