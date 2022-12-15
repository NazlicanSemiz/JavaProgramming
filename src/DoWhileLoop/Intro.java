package DoWhileLoop;

public class Intro {
    public static void main(String[] args) {

        int i = 0 ;
        do{

            System.out.println("Cilve");

        }while (i > 5); // false oldugu icin soutun icini yazdirdi bir kez sadece
        // i < 5 yaptim ve true oldugu icin sonsuza kadar yazdirdiri


        System.out.println("------------------------------------------------");

        // int i =0; zaten yukarda

        while(i >5){ // false oldugu halde do while gibi bi kere bile yazdirmiycak
            System.out.println("cilve");
        }

        System.out.println("-------------------------------------------");

        do{
            System.out.println("cilve");
            i++;

        } while (i <5); // burasi simdi dogru sonsuza kadar degil de ne kadarsa o kadar yazdirmk icin
        // i++; koyariz


    }
}
