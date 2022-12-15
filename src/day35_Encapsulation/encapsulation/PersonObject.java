package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

       Person p1 = new Person();
      // p1.name= "Daniel"; i cannnoot becuase this data is private

        // wgich function has the availablty for name ; set function
        p1.setName("cilve");
        p1.setAge(1);

        //for read
        System.out.println(p1.getName()+"  :  " +p1.getAge());






    }

}
