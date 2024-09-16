package org.example1;

public class INFO2_assercje {

    /*
    Assertions - sposob na sprawdzanie poprawnosci danych w testach
    kazdy test moze miec kilka asercji
    w podstawowej implementacji jesli pierwsza asercja wywali blad, to druga juz nawet sie nie uruchomi

    Assercje mozna robic z roznymi parametrami, np message jako ostatni z nich.
    Message wydrukuje sie tylko wtedy gdy test zfailuje
    Natomiast mozna zrobic metode ktora zwraca Stringa i ja tam wsadzic printa z inna wiadomoscia
        w takim wypadku przy failu wydrukuje sie return z metody, a przy tescie OK, metoda wydrukuje nasza informacje
            To dziala tylko w podejsciu klasycznym,
            w wywolaniu message za pomoca lambdy sout ze srodka metody sie nie wydrukuje tylko return w przypadku faila

    najczesciej uzywane:
        assertEquals / assertNotEquals
        assertTrue / assertFalse
        assertNull / assertNotNull
   Istnieja rowniez jeszcze dodatkowe biblioteki do assercji jak:
        assertJ

    aby wywolac testy po sobie mimo faila mozna uzyc Assertion.assertAll() ktore jako parametr przyjmuje
    interfejs funkcyjny Executable, i musimy te testy wywolywac za pomca lambdy w tej metodzie, jeden po drugim
    przykład CalculateNonStaticTest >> void multiply()


    mozemy rowniez sprawdzac w testach czy w metodzie zostal wyzucony wyjatek, na jaki liczymy
    w przypadku wyjatku jakiego oczkeujemy test przechodzi
    jesli program wywali inny wyjatek test zfailuje
    przykład CalculateNonStaticTest >> void divide()



     */
}