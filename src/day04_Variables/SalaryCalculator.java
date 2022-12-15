package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
    // hourly Rate' weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks; // sayiyla da carpilabilir

        // System.out.println(salary); // variable: degisken oldugu icin tirnak icinde yazmaya gerek yok

        System.out.println("hourlyRate = " + hourlyRate); //soutv : degisken secme kisayolu
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = " + salary);


        // eger tirnagin icine dolar koyarsam

    }
}
