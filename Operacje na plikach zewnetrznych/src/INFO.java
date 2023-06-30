public class INFO {


    // internacjonalizacja - Proces dostosowania programu w taki sposob aby byl w stanie odslugiwac rozne jezyki badz regiony
    // i18n << skrot

    // LOKALIZACJA - Faktyczne dostosowanie oprogramowania do uzywania danego jezyka w stosunku do regionu
    // l10n << skrot

    // w Javie mozna robic paczki zwane "boundle" w ktorych przetrzymujemy pakiety jezykowe.
    // dzialaja one na bazie klucz = wartosc
    // pozniej w kodzie mozemy wolac wartosci za pomoca kluczy.
    // Dla kazdej paczki jezykowej klucze powinny byc takie same, albo powinny byc zinicjaliozowane w paczce
    // szczegoly w: Locale.languages >> languageChanging

    // aby zrobic paczke jako boundle wchodzimy do opcji ctrl+alt+shift+s >> Modules i zaznaczamy na folderze opcje resources
    // taki folder dostaje rozszerzenie .properties


    // Klasa NumberFormat - formatauje daty i liczby zgodnie z przyjetymi normami w fanym kraju
    // klasa number format potfari zwrocic Stringa z wartsci numerycznej np: w metodzie getPercentInstance()

// -----------------------------------------------------

    // Operacje na plikach zewnetrznych WYMAGAJA obslugi IOException (in out exception)
    // zwykłe  try jest dlugie w zapisie, wymaga zawsze zdefiniowania catch lub finally w metodzie. Tutaj nie mozna rzucic wyjatku wyzej;
    // jest dodatkowa opcja w zapisie nazwyana "try with resources", ktora pozwala rzucic wyjatek wyzej i wyzej az nie zostanie on obsluzony
    // try jest wymagany, ale rzucajac wyjatek wyzej nie trzeba go obslugiwac bezposrednio w metodzie

    // konstrukcja try with resources:
//          try ( ReaderZasobuDoZamkniecia1, ReaderZasobuDoZamkniecia2) {
//                w tym miejscu dzieje sie zamykanie zasobu, jesli sie nie powiedzie przechodzimy do catcha
//           } catch (IOException) {
                    // ... dzialanie po zlapaniu bledu jesli nie uda sie zamknac zaspbu w bloku try()
//           } finally {
//                 // ... opcjonalnie, ten blok zawsze sie wywola. Jak wpiszemy tu throw new exception to skasuje nam bledy wywalane w metodzie close()  interfasu AutoClosable
//                          oraz dzialanie z bloku catch << to musze sprawdzic
//           }

    // todo 17:40 film podsumowanie

//    jesli w bloku try () { chcemy definiowac obiekty jakis klas to musza one rozrzeszac interfejs AutoClosable
//            inaczej bedzie blad. Nie mozna zrobic np: instancji Stringa
//            W try(with resources) deklarujemy tylko obiekty AutoClosable

    //  interfejs AutoClosable
        // jesli tworzymy obiekty, ktore implementuja ten interfejs, mozna overridowac metode close
        // i zasoby beda automatycznie zamykane zgodnie z nasza zaimplementowana metoda

    // Supressed Exceptions -
       // wyjatki, rzucone z metody close() z interfacu Autoclosable, ktore nadpisujemy nazywamy Supressed exception
        // mozna sie do nich dostac w odpowiedni sposob oraz "dokleic je" podczas dzialania programu (SupressedExceptions_Example)

    // jesli nie zrobimy catcha i po try rzucimy wyjatek w finally, to stracimy dostep do poprzednich wyjatkow,
        // ktore rzucalismy wczesniej


}