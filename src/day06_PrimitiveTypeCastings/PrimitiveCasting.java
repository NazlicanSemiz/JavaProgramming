package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    /*
    Primitives:
double > float > long > int > short > byte
smaller primitives can be directly assigned to larger primitive type
larger ptimitives can NOT be directly assigned to smaller primitive
types (need to be casted manually)

İlkeller:
çift > kayan nokta > uzun > int > kısa > bayt
daha küçük ilkel öğeler doğrudan daha büyük ilkel türe atanabilir
daha büyük primitifler, doğrudan daha küçük primitiflere atanamaz
türleri (manuel olarak döküm yapılması gerekir)

     */

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        // short b = short(a)
        // short(a)

        int c = b; // implicit casting
        // int c = (int)b

        long d = c;
        //  long(c)

        float e = d;
        double f = e;
        System.out.println("------------------------");

        int x = 55;
        short y = (short)x;  // error than (short) yaptik cunku int > short

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j; // long > short

        System.out.println( j + " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println( l + " : " + m);

        double n = 10.8;
        int s = (int)n; //10

        System.out.println(n+ " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1; // alt+ enter yaparsan ne ataman gerektigini soyler
        System.out.println( d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " +l1);


    }
}
