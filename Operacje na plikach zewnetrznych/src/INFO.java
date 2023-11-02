import java.io.BufferedWriter;

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


    // --------------------------------------------------------------------

    // klasa File - pozwala odwolywac sie do plikow i katalogow. Za pomoca tej klasy nie mozna modyfikowac plikow
    // klasa File ma metody np: exist, ktora sprawdza czy plik lub katalog istnieje
    // klasa File dziala na sciezkach relatwnych. Poczatkiem jest sciezka w ktorej umieszczeony jest projekt:
            // D:\Git Clone\JavaLearning\Operacje na plikach zewnetrznych>
            // jesli zrobimy sobie z poziomu InteliJ jakis plik i chcemy sie do niego odwolywac w kodzie to nalezy podac do niego dalsza sciezke
            // ./src/nazwaPackage/nazwaKolejnegoPackage/nazwaPliku.rozszerzenie

    // w Javie sciezki oddzielamy slashem "/" Java go rozumie niezaleznie od systemu
    // w windowsie oddziela sie backSlashem ale nie ma to znaczenia

    // klasa File pozwala Tworzyc nowe pliki, usówać, zmieniać nazwy, sprawdzac ostatnie modyfilacje itp >>> .\src\OutsideFiles\FileClass\
    // klasa File nie pozwala na modyfikacje plikow wewnatrz

    // --------------------------------------------------------------------

//        IO Streamy:
//    In / Out stream - mechanizm do operacji na plikach
//    InputStream / Output Stream - streamy do operacji na pojedyńczych bajtach
//    BufferedStream - streamy do operacji na paczkach bajtów np:  8 / 16 / 32 ... 256 (kiedy chcemy operować na paczkach danych a nie pojedynczych wartosciach)
//    Reader / Writer - streamy w ktorych operujemy na znakach, popularna metoda readLine

    // .flush() > metoda ktora wymusza zapis danych

//    ------------------------------------
//    klasa fileInputStream operuje na surowych bajtach. Odczytuje kazdy pojedynczy znak jako bajt, i zapisuje go jako bajt.
//    Podczas odczytywania znakow specjalnych powstaja bledy
//            nie ma tutaj jak dodac opcji z jakiego kodowania ma kozystac aby zrobić ą ę ź ...
//    z tej klasy warto kozystac w przypadku np: obrazow a nie textu.
//    W przypadku textu bedziemy uzywac Buffer Readera  i Buffer Writera

//    Klase BufferedInputStream zapisuje sie w specyficzny sposob
//        poprzez opakowanie klasy FileInputStream w BufferedInpud stream
//    nie kozystamy z pojedynczych byte'ow tylk oz tablicy byte'ow[]
//    aby uniknac bledow w zapisie podczas inicjalizowania zapisu trzeba napisac: output.write(buffer, 0, length)
//        inaczej jesli zdeklarujemy tablice o rozmiarze 4, a w ostatniej linijce zostanie 1 znak, to tablica powtorzy sie z przedostatniego zapisu i podmieni tylko ilosc znakow ktore byly nowe



//    klasa Raeder / Writer operuje na znakach zgodnie z podanym kodowaniem podczas inicjalizacji
//    jesli nie zdefiniujemy jakie kodowanie ma byc uzyte zostanie zaczytane default z systemu
//    nie działa na obrazach tylko na danych textowych.

//    BufferedReader i Buffered Writer
//    opakowuje Readera i Writera w paczki. Popularna metoda .readLine()
//    posiada metode .append() która pozwala dopisywać dane do pliku bez kasowania jego zawartosci


//    Serializable - marker interface, ktory pozwala na serializowanie obiektow klasy jesli ta klasa go implementuje
    // wszystkie inne klasy, na ktorych dziala polimorfizm tez musza implementowac serializable w takim przypadku
    // obiekty klas typu Intiger czy String implementują domyslnie Serializable
    // transient - slowko kluczowe, ktore oznacza ze danego elementu w klasie nie chcemy seriaizowac (np pola, ktore zwraca obiekt z innej klasy)
    // Static w serializacji jest pomijany bo nalezy do klasy a serializuje sie Obiekty
    // private static final long serialVersionUID = 1L - wartosc dodaje sie randomowo.
        // Jest to wersja naszej klasy ktora pomaga w identyfikaci obiektow. Jesli numer ulednie zmianie obiekty sie nie zdeserializuja


}
