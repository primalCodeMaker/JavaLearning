package Ojects.Dziedziczenie;

public class Main {

    public static void main(String[] args) {

        Rubin rubin1 = new Rubin();
        Samsung samsung1 = new Samsung();

        TV hybrid1 = new Samsung();


        System.out.println("Rubin: " + rubin1);
        System.out.println("Samsung: " + samsung1);
        System.out.println("Hybrid: " + hybrid1);
        System.out.println("----------");
        power(new Rubin());
        power(new Samsung());

    }

    public static void power(TV allTVs) {
        allTVs.turnON();
    }

//    public static void power(Samsung samsung1) {
//        samsung1.turnON();
//    }

}
