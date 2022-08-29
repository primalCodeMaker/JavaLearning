package ObjectsBasics.Cars;

import ObjectsBasics.Cars.Seat;
import ObjectsBasics.Cars.VolksWagen;

public class Main {


    public static void main(String[] args) {

        // INSTANCJE KLASY
        VolksWagen Garbus = new VolksWagen();
        VolksWagen Ogórek = new VolksWagen();


        System.out.println(Garbus.Color);
        System.out.println("RADIO: " + Ogórek.Radio);
        System.out.println(Garbus.engineVoice());

        // WYWOŁANIE METODY, KTORA JEST ZDEKLAROWANA PONIZEJ W MAINie
        newMethod();


        Seat first = new Seat("Cordoba");
        Seat second = new Seat("Leon");

        System.out.println(first.getModel());
        System.out.println(second.getModel());
        System.out.println("--------------");

        first.setModel("ZEZŁOMOWANy :(");
        second.setModel("NIE PODOBA MI SIE, WOLE GARBUSY");

        System.out.println(first.getModel());
        System.out.println(second.getModel());



    }


    // SCOPE - ZAKRES (to musi być w mainie, a nie w innej klasie)
    private static void newMethod() {
        String rokProd = "1984!";
        System.out.println(rokProd);
    }



}