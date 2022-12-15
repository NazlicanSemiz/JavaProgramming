package day37_Inheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog("max", "husky", 'M' , "small",2, "white");

        System.out.println(dog1);

        dog1.bark();


        Cat cat1 = new Cat("Tarcin","British",'M',"Small",3,"brown");

        System.out.println(cat1);

        cat1.scratch();


        Parrot parrot1= new Parrot("king","macaw",'M',"small",3,"orange");

        System.out.println(parrot1);

        parrot1.sing();

    }
}
