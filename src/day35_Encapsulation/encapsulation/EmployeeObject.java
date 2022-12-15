package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {


        Employee employee1 = new Employee("cilve",'f',28,1000);


        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2= new Employee("nazli", 'f',26,120000);
employee2.setName("nazli");
        employee2.setSalary(employee2.getSalary()+150000);

        System.out.println(employee2);


    }
}
