public class Exceptions {
}




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