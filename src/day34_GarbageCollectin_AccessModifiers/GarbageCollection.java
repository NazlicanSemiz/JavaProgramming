package day34_GarbageCollectin_AccessModifiers;

import day32_Constructor.Car;
import day30_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

/*
        String str = null; // null keyword: only assignted nonprimitives datataypes+

        System.out.println( str.toUpperCase());
*/

        String str= "Wooden Spoon"; // after line 14, "Wooden spoon" will wligible for garbage collection
        str= null;

        System.out.println(str);

        Car car1= new Car("Toyota");

        car1= null;

        System.out.println(car1);

        System.out.println("---------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy"; // unref . its is eligible for garbace collection

        dog1 =  new Dog();
        dog1.name= "Max";

        System.out.println(dog1);

        String language = "Python"; // unref . its is eligible for garbace collection
                language = "Java";

        System.out.println(language);



        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );

        System.out.println("-----------------------------------");


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

    }


}

