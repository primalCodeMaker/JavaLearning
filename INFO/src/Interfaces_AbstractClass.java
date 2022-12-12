public class Interfaces_AbstractClass {
}
// Roznice miedzy interfejsem a klasa abstrakcyjna:

//- Interfejs sie Implementuje, Klase abstrakcyjną rozszerza
//- Interfejs nie moze implementowac interfejsow, moze natomiast rozszerzać wiele klas lub interfejsow.
//- Klasa Abstract moze rozszerzać tylko 1 klase
//- Wszystkie metody interfejsu są niejawnie definiowane jako "public abstract", chyba ze zdefinijemy ją
//      jako default + ciało. W Klasach abstrakcyjnych trzeba pisać abstract
//- Klasy zwykle mogą implementować wiele interfejsów, a rozszerzać mogą tylko 1 klase
//- w interfejsie mozna zrobic metode private, czego nie da sie zrobic w klasie abstrakcyjnej
//	(tylko mozna ja wywolac bezposrednio w interfejsie, np podajac wartosc dla metody default)
//- Interfejsy nie posiadają konstruktorów, klasy abstrakcyjne muszą posiadać takie same jak klasy rozszerzające
//- Interfejsy mogą być funkcyjne, klasy abstrakcyjne nie
//	"Interfejs zapewnia funkcjonalność, natomiast konstruktor nie jest częścią funkcjonalności,
//  	jest częścią implementacji."
//- Interfejs moze miec metody statyczne
//- zarórni klasa abstrakcyjna jak i interfejs mają zachowanie polimorficzne
//
//Sprawdzić czy:
//- klasa abstract moze miec metody statyczne ?
//- Klasa abstrakcyjna może zawierać stałe (zmienne oznaczone jako public static final) a interfejs ????
//- Modyfikator dostępności (publiczny / prywatny / wewnętrzny) jest dozwolony dla klasy abstrakcyjnej. Interfejs nie zezwala na modyfikator dostępu