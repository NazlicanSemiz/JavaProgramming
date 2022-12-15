package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod_set_remove {
    public static void main(String[] args) {


        ArrayList<String> list =new ArrayList<>();
        list.add("Java");
        list.add("Cilve");
        list.add("nazli");
        list.add("mustafa");
        list.add("java");

        list.set(1, "askimcilve"); // replaces

        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList<String> employees= new ArrayList<>();

        employees.add("Cilve");
        employees.add("nazli");
        employees.add("mustafa");
        employees.add("cilvee");
        employees.add("nazlican");
        employees.add("semiz");
        employees.add("ravza");
        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size() - 1);

        System.out.println(employees);

        boolean r1 = employees.remove("cilvee");

        System.out.println(employees);

        boolean r2= employees.remove("semiz");

        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


    }
}
