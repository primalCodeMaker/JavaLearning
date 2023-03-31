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


 */