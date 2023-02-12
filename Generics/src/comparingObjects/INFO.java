package comparingObjects;

public class INFO {
}
// Comparator
// Comparator<> to interfejs funkcyjny zawierajacy 1 metode compare()
// przyjmuje oan 2 obiekty i zwraca inta
// na tej podstawie porownuje obiekty w calej lsicie i uklada je zgodnie z naszymi wytycznymi
// caleca sie implementacje za pomoca lambd


// Comparable
// Comparable to tez interfejs
// zawiera 1 metode compareTo()
// mozna go zaimplementowac za pompca lambdy
// ale jego przeznaczenie jest takie aby byl IMPLEMENTOWANY PRZEZ KLASE

// Klasy typu Integer, Double, String... implementuja Comparable
// tak wiec mozna na nich wywolywac natural.order()
// na wlasnych klasach sami musimy implementowac Comparable, albo definiowac swoj Comparator.
    // ianczej nie bedziemy mieli dostepu do zadnej formy sortowania

