package enums.Equals;

public class Main {

    public static void main(String[] args) {

        Volkswagen4 V1 = getV1();
        Volkswagen4 V2 = getV2();

        System.out.println(V1 == V2);
        System.out.println(V1.equals(V2));

        System.out.println(V2.ordinal() == 1);  //metoda ordinal pokazuje na ktorym miejscu jest nasza wartosc. Mozna to zastosowac w Switch (X.ordinal()) { case 0: case 1 ... }
        System.out.println(V1.name());  // zwraca nazwe z Enuma

    }

    private static Volkswagen4 getV2() {
        return Volkswagen4.OGOREK;
    }

    private static Volkswagen4 getV1() {
        return Volkswagen4.GARBUS;
    }
}
