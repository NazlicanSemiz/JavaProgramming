package day37_Inheritance.animalTask;

public class Parrot extends Animal{

    // if i want to add extra
    // public String parrotColor;

    public Parrot(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
        // this.parrotClor;
    }

    public void sing(){
        System.out.println(name + " is singing");
    }
}
