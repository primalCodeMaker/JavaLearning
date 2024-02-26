public class INFO {
}
/*

Recordy zostały dodane w Javie 16

Record - podobnie do Lomboka zmniejsza ilosc kodu dla typowych klas trzymajacych dane
Recordy moga byc public i default


Klase taka tworzymy przez slowo kluczowe record zamiast class
    i automatycznie mamy dodane:

     konstruktor z argumentami (nie ma konstruktora bezargumentowego)
     gettery
     equals & hashcode
     toString
     nie ma setterow (recordy tworza klasy niemutowalne)

getery przyjmuja nazwe pola, nie ma nazwy np: getName()

Recordy moga:
    posiadac bloki statyczne
    definiowac stale (public static final...)
    definiowac swoje wlasne metody
    implementowac interfacy oraz @Overrideowac jego metody
    posiadac metody statyczne
    obslugiwac typy generyczne


Recordy NIE moga:
    rozszerzac innych kals w tym klas abstrakcyjnych
    posiadac setterow

Record moze posiadac tylko konstuktor ze zdefiniowanymi wszystkimi polami klasy
    jesli chcemy to ominac, robimy metode i dajemy pola ktore nas interesuja jako argument,
    a pozostale pola w ciele tej metody trzeba ustawic na sztywno


Java disassembler - polecenie w konsoli, które wyswietla wszystkie atrybuty i metody klasy
    odpala sie w konsoli poprzez polecenie:
    javap java.util.List

Lombok daje wiecej mozliwosci
np: adnotacje @data, @builder, @with, @snickyThrows

 */