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
    // nie mozna dodac Period do localTime

// Period - klasa, ktora oznacza jakis okres czasu.
    // uzywa sie jej w tylko w odniesieniu do dat a nie do czasu
    // w przypadku klasy Period nie działa chainowanie metod, poniewaz wywolywane metody sa Statyczne i zawsze wynik bedzie nadpisywany ostatnia metoda w lancuchu
    //chainowanie metod tu nie dziala
    // Duration nie operuje w ogole na dniach. Momo metody Duration.ofDays jest to przeliczane na minuty
    // LocalDate nie jest w stanie obsluzyc Duration
    // LocalDateTime dziala z Duration

// Instant zwraca ile czasu minelo od EPOCH (1970)
    // do instanta mozna dodac godziny i dni >>> instant.plus(1, ChronoUnit.DAYS);
    // nie mozna dodac tygodni
    // dka instanta mozna uzyc metody .with()


// to.Instant >>> metoda, ktora wydrukuje nam UTC dla np obiektu klasy OffsetDateTime
    // obiektKlasyOffsetDateTime.toInstant()

//Duration - klasa podobna do Period ale operuje na czasie a nie na dacie
    //klase Period mozna zainicjalizowac podajac 3 wartosci na raz, w duration tego nie mozna zrobic
