package abstractClass;

// klasa abstrakcyjna jest szablonem do tworzenia klas
// nie można utworzyć instancji kalsy abstrakcyjnej
// aby utworzyć instancje klasy rozszerzającą klasę abstrakcyjną, konstruktor musi być w obu klasach
// Metoda ABSTRAKCYJNA w kalsach abstrakcyjnych nie może miec ciała.
    //metody ABSTRAKCYJNE pisze się bez {} i po modyfikatorze dostępu musi być slowo kluczowe abstract
    // metoda abstrakcyjna nie moze byc private
    // aby wywolać metode ABSTRAKCYJNA z klasy abstrakcyjnej trzeba ja @Overridowac w subklasie, w ktorej bedzie uzywana

// klasa abstrakcyjna MOZE MIEC metody nieabstrakcyjne, ktore coś zwracają. Takich metod nie trzeba nadpisywac

// pierwsza klasa konkretna czyli nieabstrakcyjna, na sciezce dziedziczenia (bo mozna miec kilka klas abstrakcyjnych)...
    // musi zaimprementowac WSZYSTKIE metody abstrakcyjne ze wszystkich klas abstrakcyjnycj, ktore były po drodze
// w dziedziczonych klasach absrakcyjnych nie trzeba powtarzac (redefiniowac) metod, ktore byly w poprzedniej klasie abstrakcyjnej
    // wszystkie metody muszą być zdefiniowane dopiero w pierwszej klasie konkretnej

public class Main {
    public static void main(String[] args) {


        Tree tree = new Tree("green");
        System.out.println(tree.needWater());
        System.out.println(tree.numberOfLeafs());

    }
}
