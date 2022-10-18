public class Info {
}

// Vektor i  Hashtable to jedne z pierwszych kolekcji.
    // sa rzadziej uzywane w stosunku do ArrayList i Hashmapy ponieważ są synchronizowalne - obsługują wielowatkowość przez co są wolniejsze
    // w vektorach moge dodac nulla

// hashtable >> sluzy do przechowywania klucza oraz jakieś wartości dla niego
    // Hashtable nie obsługuje Nulla


//Arraylist - w srodku ma tablice, którą zarządza. jak miejsce w tablicy się konczy to automatycznie tworzy nową tablicę o 50% większą niż poprzednia
// ma wiele fajnch metod ułatwiających prace z tablicami
// moze zawierać duplikaty
// mozemy sie bezposrednio odwolac do kazdego elementu listy
// Przy nadpisywaniu jakiegoś elementy wszyskie kolejne muszą zostać przesunięte

// LinkedList - ma informacje co jest jej pierwszym elementem a co ostatnim. Każdy koeljny element ma połązenie z następnym elementem.
// poza medodami dostepnymi dla ArrayListy Linked Lista ma dodatkowo kilka metod np: addFirst, addLast.
    // aby z nich kozystać trzeba robic linkedListe na referencji Deque, albo LinkedList. Linked Lista rozszerza klase Deque, czego nie robi Array lista
// istnieją podwujnie i pojedynczo linkowalne listy
    //podwujnie - czyli z każdego elementu jesteśmy się w stanie cofjąć albo pójść do przodu
    // pojedynczo - to taka lista, ktora będzie mogła iść tylko do przodu. Nie będzie możliwości cofnięcia się element do tyłu
// jesli chcemy sie dostac do jakiegos elementu tej listy to nie mozemy sie do niego bezposrednio odwolac, tylko trzeba isc od pierwszeg lub ostatniego elementu