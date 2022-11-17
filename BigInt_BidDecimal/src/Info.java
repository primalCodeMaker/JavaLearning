public class Info {
}
// mozna uzywac do liczenia silni

// podstawowe operatory matematyczne oraz porównania nie dzialaja dla klasy BigIntiger
    // nie mozna ich dodawać, odejmować, sprawdzac ktora jest większa itd w taki sam sposób jak primitywy

// Podstawowe metody dla BigIntegera:
    // .add() do dodawania
    // .intValue() >> przerabianie na inta, ale liczba nie moze przekraczac wartosci dla inta bo zatoczą koło od -MAX.VALUE
    // .compareTo() >> porownanie, zwraca inta -1 0 lub 1.
        // ta metoda jest nie intuicyjna, lepiej nadpisac wlasna.
// .doubleValue >> konvertuje do doubla



// BigIDecimal posiada stale ONE, TEN, ZERO
// posaiada metode .valueOF() dzieki ktorej mozna tworzyc BigDecimale
    // lepiej uzywac sposobu new BigDecimal z uzyciem ""
    // tworzenie BigDecimala za pomoca .valueOf() ucina puste zera


// posaida takie metody jak BigInteger
    // dla metody .divide trzeba podac kolejna metode, ktora bedzie ustalac jak liczba bedzie zaokraglana.
        // w innym wypadku bedzie wyjatek: Non-terminating decimal expansion; no exact representable decimal result.
// .setScale() >> metoda ktora ustala do ktorej liczby po przecinku ma byc obliczane
    // mozna ja stosowac podczas inicjowania BigDecimali
    // jesli zdeklarowana liczba ma 10 miejsc po przecinku to nie mozemy uzyc mniejszej wartosci dla .setScale()
// .pow() >> potega
// .negate() >> liczba ujemna
// .doubleValue >> konvertuje do doubla



