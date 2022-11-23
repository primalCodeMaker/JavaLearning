public class Info {
}

// Jesli w jakiejsc metodzie wartosc zwracana moze byc nullem to na dalszym etapie kompilacje moze wyskoczyc wyjatek NullPointerException
// Klasa Optional pozwala w takim wypadku zrocic cos innego niz null np: Optional.empty() <<< czyli pusta wartosc
// Podczas tworzenia metody przed typem zwracanym np: String, Int itp... dopisuje sie klase Optional z typem generycznym jaki ma byc zwracany:
    // Optional<String>  //   return Optional.empty();

// Aby pisac bezpieczny kod w kazdym wypadku gdzie metode moze zwracac nulla trzeba by było pisać if null

// Jesli wywolamy .get() na Optionalu, ktory jest pusty to dostaniemy wyjatek NoValue Present

// .orElse()   >>> ta metoda wykonuje sie zawsze
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

