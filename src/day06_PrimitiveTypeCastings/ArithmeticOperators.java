package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    /*

    + : Addiction
    -: Substact
    *: Multiplication
    /: Division

       integer /  integer ====> integer
       decimal /  integer ====> decimal
       integer / decimal =====> decimal
       decimal / decimal =====> decimal

    % : Modulus

     */

    public static void main(String[] args) {
        System.out.println("12" + 1); // "12" string old icin 121 olur yan yana alir
        System.out.println(10+20); //30
        System.out.println(100-50); //50
        System.out.println(10*5);
        System.out.println(200/10);
        // bolmenin sonucu double da ciksa java int seklinde verir
        System.out.println(100/3);

        System.out.println(10.0/4); // double verir
        System.out.println(10/4.0); // double verir
        System.out.println(10d/4); // double verir

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);

        double c =  a/6.0; //16.6666
        System.out.println(c);

        double e = (double)a/6;
        System.out.println(e);




        System.out.println(500%5);



    }
}

