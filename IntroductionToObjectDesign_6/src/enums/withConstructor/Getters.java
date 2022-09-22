package enums.withConstructor;

public class Getters {

    public static void main(String[] args) {

        Volkswagen2 volkswagen2 = getEnum();
        System.out.println(volkswagen2);

        System.out.println(Volkswagen2.PASSAT.getColors());
        System.out.println(Volkswagen2.OGOREK.getColors());



    }
    private static Volkswagen2 getEnum() {
        return Volkswagen2.GARBUS;
    }
}


