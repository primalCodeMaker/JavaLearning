public class Immutable {
}

// Immutable:
//Final pole w klasie - taka zmienna MUSI zostać zainicjalizowana na etapie tworzenia obiektu.
//Musi być w konstruktorze.
//Nie da się ustawić Setera i zmienić wartości takiej zmiennej. Inicjalizujemy ją tylko raz.

//Final podczas inicjalizowania obiektu - nie pozwala na wprowadzanie zmian w tym obiekcie poprzez referencje.
//	Jeśli pole obiektu nie jest final, to można go zmienić seterem.

//Final w argumencie metody przed typem Obiektu- nie pozwala przypisać nowego obiektu do tej zmiennej
//	sprawdzić czy tylko w scoupie metody??

//Klasa Final - nie da się rozszerzyć klasy final.
//	Można rozszerzać klase Final - final class XXX extends YY
//	Nie można innej klasy rozszerzać klasą final - XXX cla-ss extends String >> nie da sie bo String jest final

//Final metoda - nie da się takiej metody @Overridowac

//Interface i metody abstrakt nie mogą być final.
//Czy w interfejsach moga byc defaultowe metody final??

//Klasa abstrakcyjna nie może być final, bo nie bedzie mogla nic rozszerzać
//	może zawierać pola final i static

//Immutable class - koncepcja ktora nie pozwala na zmiane instancji klas. Np String jest immutable
//	Wprowadzone zmiany w stringu nie zmieniaja stanu obiektu. Trzeba nadpisać go poprzez referencję.
//	Wtedy twoży się nowy obiekt a referencja zmienia wartość na jaką wskazuje.
//Aby zrobić klase immutable należy napisac final class, oraz nie mozna zrobić seterów,
//aby nie można było zmienić stanu obiektu. Pola muszą być private, oraz mogą ale nie muszą być final


// w klasie Immutable jak dodamy konstroktor z mozliwoscia tworzenia kolekcji i przypiszemy ja do zmiennej prviate final
// to po poprzez metode public final Getter i chainowanie mozemy i tak modyfikować stan tej kolekcji
    // kolekcja.getSet().add(element);
// aby tego uniknac w metodzie Getter musimy zwrocic nowa kolekcje, ktora bedzie kopia kolekcj z klasy immutable
// i dzialajac na takim tworze wszystkie zmiany beda zyly tylko w scopie tej metody
// i nie zostana przypisane do pola klasy immutable
