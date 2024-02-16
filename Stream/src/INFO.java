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
    // count - zlicza ilosc elementow, ktora wystepuje w streamie
    // findFirst / findAny
    // min / max -> wymaga podania comparatora
    // allMatch - czy wszystkie elementy zawieraja, Jesli jakikolwiek z elementow sie nie zgadza zwraca false
    // anyMatch - jesli jakikolwiek element zawiera nasza wartosc to zwraca true
    // noneMatch - jesli zaden z elementow nie zawiera naszej wartosci zwraca true
    //forEach - wykonaj jakas akcje dla kazdego elementu. Mozna przypisac do nowej listy i zmienic elementy
             przy operacjach wielowatkowych elementy moga nam sie pobierac w streamie niezgodnie z kolejnoscia
    // reduce - skleja wszystkie elementy w streamie do jednej wartosci wynikowej. Moze to byc string albo np: Lista
    // collect - laczy elementy streama w jakas kolekcje. Nie mamy gwarancji jaka to bedzie kolekcja
        jesli chcemy wymusic jaka to ma byc kolekcja np: treeSet to uzywamy metody toCollection(Supplier ()->new kolekcja)
    // kolektor joining laczy wartosci do streinga. Mozna mu podac wartosc jaka beda oddzielone elementy



    // Collectory Zaawansowane:
        .collect(Collectors.counting()) <<< robi to samo co .count()
        .collect(Collectors.joining()) <<< laczy wartosci w jednego stringa, mozna mu podac czym maja byc oddzielone
              przyjmuje CharSequence, ma byc stosowany dla kals ktore implementuja CharSequence
        maxBy / minBy << zwraca minimalna albo maxymalna wartosc podczas porownywania
              wymaga podania comparatora
        mapping <<< laczay w jednym kroku map oraz jakas operacje terminujaca
                    mapping moze wplywac na stan obiektow, ktore przetwazamy i je zmieniac

        toMap - przerabia zbior na mape, ma 3 przeladowania - info w klasie toMapExample

        partitioningBy - zwraca mape, ktora jako klucz ma boolean,
                         a jako wartosci ma listy z przydzielonymi elementami dla True i False
                 uzywamy jesli chcemy podzielic wartosci w streamie na True / False i przypozadkowac im liste wartosci

        groupingBy - Uzywamy gdy chcemy podzielic elementty w streamie na jakies grupy
                     podobnie jak partitioningBy zwraca Mape, ale sami ustalamy co bedze kluczem
                     w tym przypadku mozemy sami okreslic implementacje tej Mapy,
                     oraz implementacje kolekcji, w ktorej bedziemy przechowywac wartosci
                     bardzo zlozony kolektor

       TeeingCollector - kolektor dodany w javie 12, pozwala laczyc ze soba 2 kolektory i zwrocic je np: w postaci
                         obiektu klasy, ktora wczesniej musiby sobie zrobic. W polach tej kalsy musimy zdefiniowac
                         pola, ktore beda przyjmowac typ, ktory zwracaja 2 kolektory, ktore bedziemy laczyc,
                         plus getery / setery / klonstruktor i wszystko co bedzie nam potrzebne
                         Po skolektowaniu dostajemy obiekt, ktory przyjmuje wartosci dla 2 kolektorow ktore laczylismy



    // Streamy obslugujace prymitywy:
        // IntStream
        // LongStream
        // DoubleStream
    // maja swoje dodatkowe metody, charakterystyczne dla wartosci numerycznych np:
        // mapToInt, boxed, mapToObj
        // average, sum
        // maja swoje oddzielne klasy, ktore je obsluguja np: OptionalDouble
 */