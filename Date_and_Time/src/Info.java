public class Info {
}
// od javy 8 stara kalsa java.util.date została zastąpiona java.time
// istnieja podstawowe klasy i każda z nich ma inne dostepne metody:
    // localDate
    // localTime
    // localDateTime

// konstruktor w tych klasach jest prywatny, to znaczy ze nie mozna zrobić nowego obiektu każdej z tych klas
// aby kozystac z kasy trzeba uzyc statycznej metody .of()

//najwazniejsze metody do dzialan na dacie i czasie:
    // .of() deklarowanie zmiennej czasowej
    // plus / minus - manipulowanie czasem
    // with - calkowita zmiana daty/czasu na zdeklarowana przez naso
    // Epoch - liczenie od 01.01.1970r
    // MIN/MAX  -999999999-01-01 / +999999999-12-31
    // ofSecondOfDay(x) - zwraca godzine na podstawie sekund
    // ofYearDay(year xxxx, day xxx) >> jaki dzien jest w roku liczone po 2giej zmiennej
    // toSecondOfDay - ilosc sekund jaka minela od poczatku dnia
    // Arrays.toString(Month.values()) - drukuje dni w meiosiacu w postaci tabeli
    // get np: getDayOfWeek()