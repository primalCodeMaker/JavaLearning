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

Skonczone - to takie, ktore maja okreslona ilosc elementow

Nieskonczone - moze miec nieograniczona ilosc elementow generowanych na bierzaco
    Stream.generate(Supplier s) - taki zapis generuje w nieskonczonosc jakas wartosc
mozna robic takie streamy ktore w nieskonczonosc generuja losowe liczby Match.random()
lub np takie, ktore iteruja wartosc +1...

Samego streama nie mozna soutPrintowac bo wychodza krzaki. Trzeba poprzez metode peak() podgladac jego wartosci



//operacje posrednie to takie, ktore zwracaja Stream



// operacje terminujace:
    // count - zlciza ilosc elementow, ktora wystepuje w streamie
    // findFirst / findAny
    // min / max -> wymaga podania comparatora
    // allMatch - czy wszystkie elementy zawieraja, Jesli jakikolwiek z elementow sie nie zgadza zwraca false
    // anyMatch - jesli jakikolwiek element zawiera nasza wartosc to zwraca true
    // noneMatch - jesli zaden z elementow nie zawiera naszej wartosci zwraca true
    //forEach - wykonaj jakas akcje dla kazdego elementu. Mozna przypisac do nowej listy i zmienic elementy
            // przy operacjach wielowatkowych elementy moga nam sie pobierac w streamie niezgodnie z kolejnoscia
    // reduce - skleja wszystkie elementy w streamie do jednej wartosci wynikowej. Moze to byc string albo np: Lista
    // collect - laczy elementy streama w jakas kolekcje. Nie mamy gwarancji jaka to bedzie kolekcja
        //jesli chcemy wymusic jaka to ma byc kolekcja np: treeSet to uzywamy metody toCollection(Supplier ()->kolekcja)
    // kolektor joining laczy wartosci do streinga. Mozna mu podac wartosc jaka beda oddzielone elementy


 */