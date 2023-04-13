public class INFO {
}
/*
Stream dzieli sie na 3 czesci:
- Poczatek, zdefiniowanie Streama
- Operacje posrednie
- operacja Terminujaca

Stream nie musi miec operacji posrednich, nie sa wymagane.

jesli nie dodamy operacji terminujacej to stream nigdy sie nie wywola

na jednym Streamie nie mozemy 2 razy wywolac operacji terminujacej, bo wywali wyjatek
    (jeden stream moze byc uzyty tylko raz)

Mozemy napisac wiele roznych Streamów dla jednej listy. Ale każdy mozna uruchomic tylko raz.


Mozna wyroznic streamy na:
 - skonczone
 - nieskonczone
 - Stream.iterate(...)  // Stream.generate(...)

Skonczone - to takie, ktore maja okreslona ilosc elementow

Nieskonczone - moze miec nieograniczona ilosc elementow generowanych na bierzaco
    Stream.generate(Supplier s) - taki zapis generuje w nieskonczonosc jakas wartosc
mozna robic takie streamy ktore w nieskonczonosc generuja losowe liczby Match.random()
lub np takie, ktore iteruja wartosc +1...
    streama nieskonczonego mozna zakonczyc operacja limit(n)

Samego streama nie mozna soutPrintowac bo wychodza krzaki. Trzeba poprzez metode peak() podgladac jego wartosci



//operacje posrednie to takie, ktore zwracaja Stream
    // filter - przyjmuje predykat i filtruje nasz zbior
    // map - uzywamy jesli chcemy w jakis sposob zminic rodzaj danych na ktorych operujemy
    // flatMap - jesli mamy zagniezdzone generyki podobnie jak w przypadku optionala
         to pozwala nam to odpakowac i dostac sie do wartosci jaka potrzebujemy
    // peek - pzowala na podglad kroku w ktorym jestesmy
    // Distinct - usowa duplikaty
         przy obiektach trzeba nadpisac equals oraz hashcode aby moc porownywac obiekty i usowac duplikaty
    // limit - pozwla ustalic dla ilu elementow naszej kolekcji mamy wykonac streama.
         po osiagnieciu limitu stream zakancza sie
    // skip - pomija pewna ilosc elementow, ktore bedziemy procesowac
         w zaleznosci w ktorym miejscu ustawimy skipa to zadziala on inaczej. Info w klasie
    // sorted - sortuje elementy w streamie ale dopiero po operacji sorted() w kodzie
        przed linijka sorted() elementy w streamie beda w poprzedniej kolejnosci




// operacje terminujace:
    // count - zlciza ilosc elementow, ktora wystepuje w streamie
    // findFirst / findAny
    // min / max -> wymaga podania comparatora
    // allMatch - czy wszystkie elementy zawieraja, Jesli jakikolwiek z elementow sie nie zgadza zwraca false
    // anyMatch - jesli jakikolwiek element zawiera nasza wartosc to zwraca true
    // noneMatch - jesli zaden z elementow nie zawiera naszej wartosci zwraca true
    //forEach - wykonaj jakas akcje dla kazdego elementu. Mozna przypisac do nowej listy i zmienic elementy
             przy operacjach wielowatkowych elementy moga nam sie pobierac w streamie niezgodnie z kolejnoscia
    // reduce - skleja wszystkie elementy w streamie do jednej wartosci wynikowej. Moze to byc string albo np: Lista
    // collect - laczy elementy streama w jakas kolekcje. Nie mamy gwarancji jaka to bedzie kolekcja
        jesli chcemy wymusic jaka to ma byc kolekcja np: treeSet to uzywamy metody toCollection(Supplier ()->kolekcja)
    // kolektor joining laczy wartosci do streinga. Mozna mu podac wartosc jaka beda oddzielone elementy


 */