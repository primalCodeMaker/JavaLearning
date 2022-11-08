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
    // .atDate() / .atTime() >>> mozna dodac czas do samej daty, lub date do czasu

// OffsetDataTime - pozwala na ustawienie przesuniecia w dacie i czasie. Mozna sie odnosic do UTC
    // w offsecie dzialaja: with, get, MIN, MAX

// ZonedDateTime sluzy do odnoszenia sie do dat i czasu w kontekscie stref czasowych
    // ogarnia zmiane czasu zimowy / letni
    // plus i minus dzialaja
    //dzialaja with, loLocalDateTime, get
    // nie dziala tutaj MIX / MAX

// Period - klasa, ktora oznacza jakis okres czasu.
    // uzywa sie jej w tylko w odniesieniu do dat a nie do czasu
    // w przypadku klasy Period nie działa chainowanie metod, poniewaz wywolywane metody sa Statyczne i zawsze wynik bedzie nadpisywany ostatnia metoda w lancuchu

// to.Instant >>> metoda, ktora wydrukuje nam UTC dla np obiektu klasy OffsetDateTime
    // obiektKlasyOffsetDateTime.toInstant()
