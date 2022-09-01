package Methods.GetterandSetter;
// Getter - metoda do odwoływania się do wartości z prywatnych pull.
// w metodach można pisać jeśli null to zwróć coś, lub jeśli tablica jest nulem to stwórz nową
    // w przeciwnym wypadku wyskoczy blad NullPointerException

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Comuter PC = new Comuter("MSI", "i7", 1024);

        System.out.println(PC.getMainboard());
        System.out.println(PC.getProcesor());
        System.out.println(PC.getSSDcapacity());
        System.out.println(Arrays.toString(PC.getRAMslot()));

        System.out.println();
        System.out.println("time to changes..");

        PC.setMainboard("empty");
        PC.setProcesor("Intel Xeon Gold");
        PC.setRAMslot(new int[4]);

        System.out.println(PC.toString());

    }


}
