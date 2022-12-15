package ForLoop;

public class StartsWithEndsWith {
    public static void main(String[] args) {

        String a= "Cilve askim";

        System.out.println(a.startsWith("Cil")); // true boolean gibi
        System.out.println(a.endsWith("askim")); //true

        System.out.println(a.toLowerCase().startsWith("cilve"));

    }
}
