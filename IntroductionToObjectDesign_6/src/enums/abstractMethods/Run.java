package enums.abstractMethods;

public class Run {
    // wywolanie Enuma z innego enuma
    // robimy to poprzez @Overrideowanie metody abstrakcyjnej w Enumach i zwracamy w returnie innego Enuma
    // jesli dodamy metode abstrakcyjna w klasie Enum, to kazdy Enum musi ja @Overrideowac

    public static void main(String[] args) {

        Volkswagen5 V3 = Volkswagen5.GARBUS;
        Volkswagen5 V4 = Volkswagen5.PASSAT;

        System.out.println(V3.name());
        System.out.println(V3.ifMissing());
        System.out.println(V4.ifMissing());


    }

}
