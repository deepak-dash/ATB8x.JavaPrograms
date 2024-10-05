package Oct.ex04102024;

public class Lab095 {
    public static void main(String[] args) {
        AHuman amit = new AHuman();
        AHuman pramod = new AHuman("Deepak");
        AHuman vijay = new AHuman("Deep");
        System.out.println(amit.planet);
        System.out.println(pramod.planet);



        System.out.println(amit.name);
        System.out.println(pramod.name); // Pramod
        System.out.println(vijay.name); // Vijay

    }
}
