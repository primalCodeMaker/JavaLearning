public class InfoKolekcje {
}

// Vektor i  Hashtable to jedne z pierwszych kolekcji.
    // sa rzadziej uzywane w stosunku do ArrayList i Hashmapy ponieważ są synchronizowalne - obsługują wielowatkowość przez co są wolniejsze
    // w vektorach moge dodac nulla

// hashtable >> sluzy do przechowywania klucza oraz jakieś wartości dla niego
    // Hashtable nie obsługuje nulla ani dla kluczy ani dla wartosci


//Arraylist - w srodku ma tablice, którą zarządza. jak miejsce w tablicy się konczy to automatycznie tworzy nową tablicę o 50% większą niż poprzednia
// ma wiele fajnch metod ułatwiających prace z tablicami
// moze zawierać duplikaty
// mozemy sie bezposrednio odwolac do kazdego elementu listy
// Przy nadpisywaniu jakiegoś elementy wszyskie kolejne muszą zostać przesunięte
// ArrayList obsluguje nulle i duplikaty
    // natomiast podczas proby sortowania wywala null pointer, chyba ze napiszemy dobry comaprator, ktory ogarnie nulle

// LinkedList - ma informacje co jest jej pierwszym elementem a co ostatnim. Każdy koeljny element ma połązenie z następnym elementem.
// poza medodami dostepnymi dla ArrayListy Linked Lista ma dodatkowo kilka metod np: addFirst, addLast.
    // aby z nich kozystać trzeba robic linkedListe na referencji Deque, albo LinkedList. Linked Lista rozszerza klase Deque, czego nie robi Array lista
// istnieją podwujnie i pojedynczo linkowalne listy
    //podwujnie - czyli z każdego elementu jesteśmy się w stanie cofjąć albo pójść do przodu
    // pojedynczo - to taka lista, ktora będzie mogła iść tylko do przodu. Nie będzie możliwości cofnięcia się element do tyłu
// jesli chcemy sie dostac do jakiegos elementu tej listy to nie mozemy sie do niego bezposrednio odwolac, tylko trzeba isc od pierwszeg lub ostatniego elementu


    //Set jest Interfejsem, Hashset jego implementacja
// Set - pozwala wykonywać rozne dzialania na osobnych zbiorach.
// Nie zachowuje kolejnosci elementow w zbiorze
// porownujac ze soba obiekty w setach trzeba nadpisac metody equals i hashcode
// nie moze zawierac duplikatow
// mozna sklejac ze soba  2 sety i wartosci nie beda sie duplikwowac


//HashSet - HashSet jest klasą, ktora implementuje interfejs Set, posiada więc metody:
    // add(), clear(), clone(), contains(), isEmpty(), iterator(), remove(), size().
// HashSet najpierw oblicza hash obiektu, aby określić indeks tablicy, pod którym obiekt będzie przechowywany.
// Później obiekt jest przechowywany pod obliczonym indeksem. Tak samo dziala  wyszukiwanie i usuwanie
// HashSet obsluguje nulle ale usuwa duplikaty


// LinkedHashSet zachowuje kolejnosc dodawania
// pod spodem ma implementacje podwojnie linkowanej LinkListy
    // nie ma mozliwosci iteracji id tylu
// nie zachowuje duplikatow
// nie mozna porbac obiektu na danym miejscu (nie ma metody get)
// wazne jest napisanie dobrej metody equals()

// TreeSet kolejna implementacja seta
// nie zachowuje duplikatow i od razu sortuje elementy (jego elementy sa zawsze posortowane)
// ma strukture drzewiasta, to znaczy ze kazdy kolejny element porownuje z poprzednim, zgodnie z naszymi wymaganiami
// i umieszcza go pod spodem juz w odpowiednim posortowanym miejscu
// implementuje SortedSet
// elementy TreeSetu musza implementowac Interfejs Comparable, inaczej poleci Exception
// jesli nie implementuje to musimy zdefiniowac lambda comparator podczas definiowania TreeSeta
// treeSet nie kozysta z Equals i Hashcode, do porownywania obbiektow kozysta tylko z Comparatora
// TreeSet nie moze zawierac wartosci null, bo od razu prubuje sortowac elementy. Musimy pisac swoja obsluge nulli

//NavigableSet - interfejs ktory moze sluzyc do deklarowania TreeSetu
//posiada metody:
    // E lower(E e) - Zwraca najwiekszy element, ktory jest < e, lub null jestli taki element nie istnieje
    // E floor(E e) - Zwraca najwiekszy element, ktory jest <= e, lub null jestli taki element nie istnieje
    // E ceiling(E e) - Zwraca najmniejszy element, ktory jest >= e, lub null jestli taki element nie istnieje
    // E higher(E e) - Zwraca najmniejszy element, ktory jest > e, lub null jestli taki element nie istnieje

// Po dodaniu elementu do Seta jako nowy obiekt, nie mozna go pozniej modyfikowac.
    // Raz dodany element do Mapy nie jest weryfikowany i moze dojsc do zrobienia duplikatu,
    // podczas zmiany jego stanu Seterem
    // Obiekty dodawane do Seta powinny byc Immutable

// lepiej używać Interfejsu w definicji zmiennej np List albo Collection
    // poniewaz pozniej jak robimy metode a mamy array liste i linkedliste to nie musimy pisac 2och metod aby je osobno obsluzyc
    // jesli uyjemy interfejsu Collection bedziemy mogli taka metode uzywac rowniez na setach