public class Exceptions {
}

// Wyjatki RuntimeException, mozna zdefiniowac wlasne robiac klase, ktora rozszerza RuntimeException

// Wyjatki Check-Exception - to takie, ktore rozszerzaja klase Exception
    // sa sprawdzane na etapie kompilacji
    // wymagaja obslugi Try {} Cath {}

// Wyjatki mozna wyzucac wyzej, aby zostaly obsluzone na pozniejszym etapie kompilacji a nie bezposrednio
// np: w metodzie ktora generuje wyjatek

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
    // Bledy typu Runtime mozemy dodawac



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