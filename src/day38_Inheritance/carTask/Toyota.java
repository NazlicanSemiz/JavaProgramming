package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String brand, String model, int year, double price, String color, int miles){
        super(brand,model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" " + model+" is reliable");
    }

    @Override
    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model+" is starting");

    }




}

/*
Create the following sub classes of Car:
1. Toyota:

extra methods:

reliabile()
 */