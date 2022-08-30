package ModyfikatoryDostepu;
// modyfikatory dostępu sa uzywane dla klasy, pola klasy, konstruktora oraz metody

// public - modyfikato widziany we wszystkich paczkach danego projektu
    // to znaczy ze jak zrobie np publiczne pole klasy lub metode w jegnej paczce, to dostęp do tego będzie w kazdej paczce projektu

// protected - mozna uzywac tylko w klasie w ktorej jest zdefiniowany taki modyfikator
    // protected daje rowniez dostep klasą, ktore rozszerzaja klase bazowa o ile znajduja sie w tej samej paczce.
    // protected nie moze stac przed klasa

// default - brak modyfikatora dostepu.  Dostep do takiego typu modyfikatora beda mialy wszystkie klasym ktore sa w tej samej paczce

// private - modyfikator dostepu, ktory jest dostepny tylko z obrebie pola, metody lub konstruktora w ktorym zostal zdefiniowany. Klasa nie moze byc private
    //private ogranicza nawet dostep do klas, w ktorych uzywamy dziedziczenia.
         // Jesli np pole w klasie bazowej bedzie private a inna klasa bedzie z niej dzidziczyc to i tak nie bedzie maila dostepu do teog pola


public class Main {

    public static void main(String[] args) {

    }
}
