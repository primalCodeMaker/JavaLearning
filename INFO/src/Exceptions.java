public class Exceptions {
}

// Wyjatki RuntimeException, mozna zdefiniowac wlasne robiac klase, ktora rozszerza RuntimeException

// Wyjatki Check-Exception - to takie, ktore rozszerzaja klase Exception
    // sa sprawdzane na etapie kompilacji
    // wymagaja obslugi Try {} Cath {}

// Wyjatki mozna wyzucac wyzej, aby zostaly obsluzone na pozniejszym etapie kompilacji a nie bezposrednio
// np: w metodzie ktora generuje wyjatek,
// uzywa sie do tego slowa kluczowego throws za sygnatura metody + typ wyjatku jaki ma byc rzucany

// StakTrace - Wyswietla jaki wyjatek zostal wywolany oraz kazdy punkt wywolania

// aby zucic wyjatek np w metodzie uzywa sie slow kluczowych :
    // throw new RuntimeException
    // throw new Exception
    // throw new MojZdefiniowanyWyjatekWklasieRizszerzajacejRuntimeException

// mozna zucac wyjatek w wyjatku
    // zalozmy ze zucamy MyException w metodzie i lapiemy go wyzej poprzez Try {} Cath {}
    // w catch piszemy throw new Exception i mamy przyklad zagniezdzenia

// Multicatch - jesli klasy typu Exception rozszerzaja sie wzajemnie to mozna lapac je zgodnie z hierarchia
    // zaczynajac od najbardziej zagniezdzonego do najbardziej ogolnego:
    // catch (3) {
    // } catch (2) {
    // } catch (1) {}


// OVERLOADING:
    // Mozna overloadowac exceptiony pod warunkiem ze zucaja taki sam blad.
    // nie mozna overrideowac wyjatkow z nadawac im inny typ wyjatku

// OVERRIDING:
    // mozna @Overrideowac excepiony i nadawac im inny wyjatek do zucenia niz ten z metody bazowej
    // pod warunkiem ze chcemy zucic bardziej zagniezdzony wyjatek w hierarchi dziedziczenia
    // w 2 strone nie da sie overrideowac
    // nie mozna tez wybrac innego bledu typu Catch, jesli nie jest on dziedziczony
    // Bledy typu Runtime mozemy dodawac dowolnie


// Mozna zucac wyjatki w Konstruktorach w zwyklych klasach np za pomoca if()
    // i beda one wywolywane na poziomie tworzenia obiektu jesli bedzie to Runtime
// Jesli taki wyjatek bedzie typu catch to trzeba bedzie obsluzyc w konstruktorze
// albo rzucic wyzej za pomoca throws.
// Wyzej mozna przekazywac Exceptiony, ktore sa bardziej ogolne w hierarhii dziedziczenia

// w klasach rozszerzajacych Exceprion tez mozna robic konstruktory i w argumencie wpisac np: String message
    // ten message bedzie zwracal naszego Stringa podczas tworzenia i wywolania wyjatku


// W bloku inicjalizacyjnym zwyklym i statycznym mozna pisac wyjatki
// Sa one przydatne podczas ladowania plikow z zewnatrz. Zazwyczaj sa to wyjatki typu Catch
// W blokach instancyjnych trzeba dopisac throws do wszystkich konstruktorow kalsy
// w blokach statycznych od razu trzeba obsluzyc taki wyjatek w bloku
    // poniewaz w kontekscie statycznym nie mozemy wypchac bledu do konstruktora
    // mozna wpisac Runtime w bloku statycznym ale wyskoczy error Exception Initializer Error

// finally - instrukcja, ktora zawsze sie wykona po rzuceniu wyjatku zanim strumien zostanie przerwany
    // w fnally mozna rzucac kolejne wyjatki
// dozwolone kombinacje:
    // try, catch, finally
    // try, finally

// WYJATKI:
//- Jesli wywolamy .get() na Optionalu, ktory jest pusty to dostaniemy wyjatek "NoValue Present"
//- dzielenie przez zero "/ by zero"
//- drukowanie poza tablica = out of bounds
//- rzutowanie w dziedziczeniu: Subclas Referencja, Object superclass rzutowany na subclass:
//	House XXX = (House)new Building();  >>> Class cast exception
//- number Format Exception
//	jak probujemy uzyc metody:
//		String a = "sdf"Int b = Integer.parseInt(a)

// illegal argument exceptions - np: jak chcemy wyciagnac wartosc, ktorej nei ma w enumie do stringa
//    poorzez metode:   Klasa.valueOf("WartoscENUMA");