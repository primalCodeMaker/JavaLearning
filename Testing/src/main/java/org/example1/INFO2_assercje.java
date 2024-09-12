package org.example1;

public class INFO2_assercje {

    /*
    Assertions - sposob na sprawdzanie poprawnosci danych w testach
    kazdy test moze miec kilka asercji
    w podstawowej implementacji jesli pierwsza asercja wywali blad, to druga juz nawet sie nie uruchomi

    Assercje mozna robic z roznymi parametrami, np message jako ostatni z nich.
    Message wydrukuje sie tylko wtedy gdy test sfailuje
    Natomiast mozna zrobic metode ktora zwraca Stringa i ja tam wsadzic printa z inna wiadomoscia
        w takim wypadku przy failu wydrukuje sie return z metody, a przy tescie OK, metoda wydrukuje nasza informacje
            To dziala tylko w podejsciu klasycznym,
            w wywolaniu message za pomoca lambdy sout ze sodka metody sie nie wydrukuje tylko return w przypadku faila

    najczesciej uzywane:
        assertEquals / assertNotEquals
        assertTrue / assertFalse
        assertNull / assertNotNull
   Istnieja rowniez jeszcze dodatkowe biblioteki do assercji jak:
        assertJ




     */
}