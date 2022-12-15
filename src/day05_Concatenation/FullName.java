package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Nazlican";
        String lastName = "Semiz";
        int age = 25;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";

        String fullName = firstName + " " + lastName; // arasinda bosluk icin ..+ " " + ..
        System.out.println(fullName);

        // Full name of the person is....
        System.out.println("Full name of the person is " + fullName);

        //.... is .... years old.
        System.out.println(fullName + " is " + age + " years old.");

        // FullName is Jobtitle , works at CompanyName
        System.out.println( fullName + " is  " + jobTitle + ", "+ " works at " + companyName);
    }
}

/*
1. Create a class called FullName.java
2. Declare the following variables:
1.firstName
2.lastName
3. Use concatenation to print the full address
 */