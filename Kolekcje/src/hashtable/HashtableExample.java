package hashtable;

import java.util.Hashtable;

public class HashtableExample {

    private static final String DP = "Disco Polo";
    private static final String RAP = "DzikieRapsy";
    private String cant = "Nie moge wpisac wiecej niz 1 wartosc dla jednego klucza";

    public static void main(String[] args) {

        HashtableExample object = new HashtableExample();

        Hashtable hashTable = new Hashtable();
        hashTable.put("Zenek", DP);
        hashTable.put("2PAC", RAP);
        hashTable.put("Maryla", 89);
        hashTable.put("NULL", "Null tutaj nie zadziala");
        hashTable.put("STH", new Object());
        hashTable.put("STH2", object.toString());
        hashTable.put(1, object.cant);
        hashTable.put(5, object.getCant());
        hashTable.put(object.toString(), "objekt z referencji jest kluczem ");
        hashTable.put(new Object(), "new Objekt() stworzony bezposrednio w hashtable ");

        for (Object o : hashTable.entrySet()) {
            System.out.println(o);
        }

    }

    public String getCant() {
        return cant;
    }

}
// nie moge wpisac vektora jako wartosc zeracana