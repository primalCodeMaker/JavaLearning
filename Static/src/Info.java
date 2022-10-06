public class Info {

    // Metody statyczne wywolywane sa na klasie a nie na obiekcie (Static nalezy do klasy a nie do obiektu)
    // nie statyczna metoda nie moze zostac wywolana ze statycznego kontekstu
    // nie mozna uzywac metod niestatycznych w statycznych poniewaz metody niestatyczne sa wywokywane na gotowym obiekcie i kompilator na tym etapie nie potrafi ich przetworzyc
    // this rowniez nalezy do obiektu i nie mozna w ten sposob odwolywac sie do pol w metodach statycznych
    // zamiast this mozemy sie odniesc do pola statycznego podajac klase np: Dog.howManyDogsWeHaveGot;

    // pola statyczne sa dostepne dla wszystkich obiektow danej klasy i maja zawsze ta sama wartosc

    // w nie statycznych metodach mozemy uzywac metod statycznych poniewaz one zostaly zainicjalizowane wczesniej

    // za pomoca staic mozna defoniowac stale np: public static final String = "STH";



    // sa 3 rodzaje zmiennych:
    // Instatns - przypisane do instancji klasy (obiektu). Jak obiekt zginie zmienne zgina razem z nim
    // Local - zmienna w zakresie danej metody. Po za tą metodą nie istnieje
    // Zmienna klasy -
}
