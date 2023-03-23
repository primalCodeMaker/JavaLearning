public class Info {
}

// mechanizm lambd zostal dodany w Javie8
// stosowany w programowaniu funkcyjnym

// konstrukcja lambd tworzy anonimowe metody, ktore maja cialo ale nie maja swojej nazwy
    // nie potrzeba instancji klasy aby je wywolac.
// lambdy deklaruje sie troche tak jak zmienna

// konstrukcje Lambdy mozna wywolać tylko na interfejsie, ktory posiada tylko jedna metode abstrakcyjną,
    // taki interfejs moze posiadac inne metody defaultowe lub statyczne, ale nie moze posiadac wiecej metod bez ciala
    // taki interfejs oznaczany jest jako @Interfejs Funkcyjny

//Lambda ma dwa sposoby zapisu:
    // skrocony dla lambd z okreslonym tylko 1 parametrem
    // pelny dla lambd z conajmniej dwoma parametrami

// Nie jest okreslone jak zachowa sie implementacja lambdy w pamieci.
    // Java nie zawsze tworzy nowe obiekty podczas wywolywania lambdy

// W jednolinijkowej definicji lambdy nie trzeba pisac return dla metod innych niz void
//w wielolinijkowej definicji lambdy musimy pisac return;


// Predykat - interfejs funkcykny dostarczany przez Jave, ktory przyjmuje tylko jeden argument oraz posiada wbudowana jedna metode Test
    // wymaga zdefiniowania typu generycznego
// Predykat jako arkument wejściowy może przyjąć Obiekty lub Stringa, ale zawsze zwraca boola


// Method Reference - mechanizm zapisu funkcji
// NazwaKlasy :: NazwaMetody
// uzywamy tego mechanizmu kiedy chemy aby zamiast bezpośredniej implementacji lambdy uzyc metody,
    //inaczej mówiac kiedy jakąś metodą chcemy zaimplementować dany interface funkcyjny
    //  Taka metoda musi miec te same zdefiniowane parametry

// Mozna stosowac na 3 sposoby:
    // w odniesieniu do metod instancyjnych
        // nazwaObjektu::nazwaMetodyInstancyjnej
    // w odniesieniu do metod statyczynch
        // NazwaKlasy :: nazwaMetody
    // w odniesieniu do konstruktorow
        // NazwaKlasy :: new


// Java ma wbudowane interfejsy funkcyjne, różnią sie typem danych wejściowych i typem zwracanym
// Predicate
    // przyjmuje cokolwiek i zwraca boola.
    // Posiada metode test(), którą musimy wywolac aby uruchomic nasz predykat


// Consumer - konsumuje
    // przujmuje jakis argument i nie zwraca voida. (konsumuje - przyjmuje cos i nic nie zwraca)
    // posiada metode accept()

// Supplier - dostawca
    // nie przyjmuje zadnego argumentu a zwraca cos
    // posiada metode get()

// BiPredicate
    // posiada dwa parametry i rowniez zwraca boola
    // Posiada metode test()

// BiConsumer
    // todo 25:30 w filmie