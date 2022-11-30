public class Info {
}

// Member Inner Class:
    // klasa, ktora jest zdefiniowana w obrebie klasy
    // nie mozna w niej robic metod statycznych
    // pola statyczne musza miec od razu przypisana jakas wartosc
    // nie mozna stwozyc instancji klasy zagniezdzonej bezposrednio w metodzie statycznej
    // mozna zrobic instancje takiej klasy w metodzie i wywolywac ja na metodzie statycznej
    // moze dziedziczyc i implementowac
    // klasa zewnetrzna moze odwolac sie do pola prywatnego klasy wewnetrznej
    // klasa zagniezdzona moze odwolywac sie do pol klasy zewnetrznej poprzez import (NotMain.Inner.InnerInner innerInner = inner.new InnerInner();)
    // klasa wewnetrzna moze posiadac swoja klase wewnetrzna
    // klaza zewnetrzna nie moze wywolywac metod klasy zagniezdzonej bez instancji tej klasy zagniezdzonej
    // moze byc abstrakcyjna
    // moze byc final
    // moze byc public, private, default, protected

//Local Inner Class
    // klasa, ktora jest zdefiniowana w obrebie metody
    // nie ma modyfikatora dostepu bo w strodku metody nie pisze sie tego
    // nie moga byc statyczne
    // nie moga definiowac statycznych pol ani metod
    // ma dostep do wysztkich pol i metod klasy, ktora ja posiada
    // nie mamy dsotepu do zmiennych takiej klasy zagniezdzonej, chyba ze sa zdefiniowane jako final albo effectively final
        // effectively final oznacza ze zmienna raz zdefiniopwana nie moze byc nadpisywana po raz kolejny
        // jesli zrobimy zmienna a, to mamy do niej dostep z Local Inner Class. Natomiast jesli nadpiszemy ta zmianna po raz drugi to proba odwolania sie do niej spowoduje blad kompilacji
        // effectively final nie ma swojego modyfikatora dostepu ani slowa kluczowego. To jest umowna koncepcja