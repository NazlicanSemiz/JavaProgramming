package Day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Josh";
        int age= 38;
        String citizen= "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // true
        //eligible
        if(isEligible){ // true yani cikti verecek
            System.out.println("Eligible");
        }

        //not eligible
        if (!isEligible){  // false yani ciktida gostermez vermez
            System.out.println("Not Eligible");
        }
    }
}
