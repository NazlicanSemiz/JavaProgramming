package day09_IfStatements;

public class EligibleAlchol {
    public static void main(String[] args) {

        int age =16;

        boolean isEligible = age >= 18;

        if (isEligible){
            System.out.println("Eligible");
        }else if (!isEligible){
            System.out.println("Not Eligible");
        }
    }
}
