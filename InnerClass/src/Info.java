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

// Anonymous Inner Class
    // nie ma nazwy
    // deklaruje sie ja w jednej linijce
    // musi cos extendowac albo implementowac
    // nie moze extendowac albo implementowac jednoczesnie
    // zapis klasy anonimowej byl stosowany przed java8,
    // teraz jest zamienna z lambdami o ile implementuje interfejs
    // taki interfejs nie moze miec wiecej niz 1 metode abstrakcyjna tak jak w interfejsie funkcyjnym
    // implementacja klasy abstrakcyjnej poprzez Anonymous Class ma dostep do pol z klasy zewnetrznej

// Statcic nested Class
    // definiowane na tym samym poziomie co zmienne statyczne
    // nie ma dostepu do pol instancyjnych (nie statycznych) klasy zewnetrznej
    // moze miec wsyzstkie modyfikatory dostepu
    // klasa zewnetrzna moze sie odnosic do jej pol oraz metod
    // moze posiadac pola i metody statyczne i niestatyczne
    // mozna zagniezdzac w niej kolejne klasy