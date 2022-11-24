public class Info {
}

// Jesli w jakiejsc metodzie wartosc zwracana moze byc nullem to na dalszym etapie kompilacje moze wyskoczyc wyjatek NullPointerException
// Klasa Optional pozwala w takim wypadku zrocic cos innego niz null np: Optional.empty() <<< czyli pusta wartosc
// Podczas tworzenia metody przed typem zwracanym np: String, Int itp... dopisuje sie klase Optional z typem generycznym jaki ma byc zwracany:
    // Optional<String>  //   return Optional.empty();

// Aby pisac bezpieczny kod w kazdym wypadku gdzie metode moze zwracac nulla trzeba by było pisać if null

// Jesli wywolamy .get() na Optionalu, ktory jest pusty to dostaniemy wyjatek NoValue Present

// orElse >> jesli empty to wykonaj.
    // .orElse()   >>> ta metoda wykonuje sie zawsze, nie zależnie od tego czy mamy jakas wartosc czy jest empty
    // Jesli obiekt bedzie mial wartosc (nie bedzie empty) to metoda i tak sie wykona ale zwroci wartosc docelowa dla obiektu i nie nadpisze go
// .orElseGet(()  >>> ta metoda wywoluje sie TYLKO gdy zwracana wartosc jest EMPTY
        // stosujemy ja gdy chcemy pobrac jakies informacje z bazy danych lub systemow zewnetrznych
        // takie operacje sa kosztowne w programowaniu i chcemy uniknac wykonywania ich jesli to wykonanie nie jest potrzebne
        // inaczej mowiac ta metoda wykona sie tylko w momencie kiedy konieczne bedzie jej wykonanie

// ifPresent() >> jesli pelne to wykonaj metode
    // funkcja stosowana do lambd. W argumentach wymaga Interfejsu Funkcyjnego Supplier. isPresent nie dziala dla lambd
// ifPresentOrElse() >> do powyzszej metody mozna dopisac co ma zwracac w przypadku gdy wartosc bedzie pusta
    // w innym wypadku zwrocilo by wyjatek

// W przypadku tworzenia nowego obiektu opakowanego w Optional nie można zwrócić ich wartości zwykłym getterem
// w takim przypadku mamy metode .map()
    // map operuje na wartosci, ktora jest w srodku optionala
    // mapy wywoluja sie tylko gdy wartosc na ktorej chcemy operowac istnieje
// jesli getter jest rowniez opakowany w optionala to do wyciagniecia tej wartosci jest metoda .FlatMap()
    // flatMap rozpakowuje Optionala, ktory jest zagniezdzony i tym samym skraca zapis i poprawia czytelnosc kodu

//Filter:  stosujemy jesli dla Optionala chcemy okreslis warunki jakie musza byc spelnione
    // jesli choc jeden warunek nie jest spełniony to zwraca wartosc Optional.Empty
    // filter jako warunek przyjmuje Predykat

// .or()
    // metoda ktora moze zwrocic innego optionala, jesli mamy Optional.Empty
    // metora .orElse() moze zwracac tylko wartosc wiec nie mozna jej do tego uzyc
    // jesli pierwsza wartosc w metodzie bedzie pusta, to wykona sie druga czesc metody
    // jesli pierwsza wartosc w metodzie nie bedzie empty, to kod nie bedzie sie dalej wykonywal, tylko zwroci ta wartosc

// .orElseThrow() >>> rzuca wyjatek jesli Optional jest epmty.
    //  Sa 2 przeladowania metody, jedna bez argumentow
    // druga z supplierem, w ktorym mozemy wybrac jaki rodzaj Wyjatku rzucamy, oraz wiadomosc
    // rzucanie wyjatku jesli puste zakonczy dzialanie programu

// Tworcy Javy zalozyli ze Optional nie powinien byc parameetrem metody, bo moze zwrocic nulla