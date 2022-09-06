package PassByReferenceOrPassByValue;

public class Main {  // JAVA jest pass by Value.

    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");

        refferenceOrValue(cat); // tutaj zmiany dzieja sie tylko w obrebie metody. Zeby zmienic wartosc na stale dla cat.name trzeba zrobic
                                // settera, ktory zadziala bezposrednio na pole cat. name w klasie Cat i podmieni wartosc.
                                // to co sie dzieje w tym momencie w metodzie ginie po za zakresem metody
        System.out.println(cat);
        //System.out.println(cat2); // cat2 stwozyno w metodzie static nie istnieje po za ta metoda
        System.out.println();

        int b = 10;
        System.out.println(b);
        prymitywy(b);
        System.out.println(b);
        // b = prymitywy(a);  - metoda void nie zmieni waerosci zmiennej bo bo musiala by zwracac inta

    }

    private static void refferenceOrValue (Cat cat){
        cat = new Cat("Rafal");
        Cat cat2 = cat;
        System.out.println(cat);
        System.out.println(cat2);
    }

    private static void prymitywy(int a) {
        a = 5;
        int b = a;
    }
}
