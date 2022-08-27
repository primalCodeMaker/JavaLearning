package Methods;
// w klasie mozemy miec wiele metod o tej samej nazwie o ile maja rozne typy parametrow
// java rozkminia je po typach oraz ilosci uzytych parametrow
// jesli metody beda mialy ten sam parametr z inna nazwa parametru to program sie nie skompiluje

import java.util.Arrays;

public class Overloading {

    public static String status;
    public static int power;


    public static void main(String[] args) {
        String upgraded = "is upgraded?";

        Overloading.Axe(status);
        Overloading.Axe(power);
        Overloading.Axe(status, power);

        Overloading.Axe(status, power, upgraded);
        Overloading.Axe(power);
    }

    private static void Axe (String status) {
        status = "broken";
        System.out.println("Axe was " + status);
    }

    private static void Axe (int power) {
        power = 3;
        System.out.println("Axe + " + power + " to wood cutting");
    }

    private static void Axe (String status, int power) {
        status = "repaired";
        power = 5;
        System.out.println("Axe was " + status + " and upgraded to: " + power + " wood cutting");
    }

    private static void Axe (String status, int power, String upgraded) {
        upgraded = "Head Smashing added";
        status = "devoted to the blacksmith";
        power = 55;

        System.out.println("Axe: " + status + ", " + upgraded + ", + " + power + " to cutting power");
    }

    private static void Axe (int... power) {
        power = new int[]{125, 255};
        System.out.println("War Arrrgs... AXE!" + Arrays.toString(power));

    }

}
