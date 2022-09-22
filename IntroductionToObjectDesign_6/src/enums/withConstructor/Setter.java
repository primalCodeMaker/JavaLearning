package enums.withConstructor;

public class Setter {

    public static void main(String[] args) {

        Volkswagen2 volkswagen2 = Volkswagen2.GARBUS;
        System.out.println(volkswagen2.getColors());
        volkswagen2.setColors("IceBlue");

        System.out.println(volkswagen2.getColors());
        System.out.println(Volkswagen2.GARBUS.getColors());

        Volkswagen2.OGOREK.setColors("Green");
        System.out.println(Volkswagen2.OGOREK.getColors());

        System.out.println(Volkswagen2.OGOREK);
        System.out.println(Volkswagen2.GARBUS);

    }
}
