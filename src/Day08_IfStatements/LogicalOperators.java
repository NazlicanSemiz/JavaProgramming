package Day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name= "Steven";
        int age = 19;
        String citizen= "UK";

        Boolean isEligible = age >= 18 && citizen == "USA";
        //                    19 >= 18 && "UK =="USA"
        //                     TRUE     && FALSE ===> FALSE

        System.out.println(name + " is eligible to vote: " + isEligible);

        //-------------------------------------------------------------

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 = creditScore >= 700  && age2 >=21;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("----------------------------------------------");

        String name3 ="Shay";
        int age3=21;
        char gender='F';

        boolean isEligible3 = age3>= 18 && ( gender == 'M' || gender=='F');
        //                    TRUE      &&  (      FALSE    ||     TRUE )
        //                      TRUE &&            TRUE ====> TRUE

        System.out.println( name3 + " is  eligible to register: " + isEligible3);

        System.out.println("-------------------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------");

        int score = 85;
        boolean passed =  score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
