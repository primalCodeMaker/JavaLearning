package WARSZTAT1.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets2 {

    public static void main(String[] args) {
        Set<Dog> dogos = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        dogos.add((new Dog("Czarek", 1)));
        dogos.add((new Dog("Karmel", 2)));
        dogos.add((new Dog("Aron", 3)));
        dogos.add((new Dog("Pimpek", 4)));
        dogos.add((new Dog("Burek", 5)));
        dogos.add((new Dog("Burek", 6)));

        // tutaj mamy swoj wlasny comparator, ktory nadpisze ten z klasy
        // gdyby, nie mial zaimplementowanego komparatora w kasie Dog, wywalilo by blad
        // poneiwaz elementy TreeSetu musza implementowac Comparable,
        // lub musimy zdefoniowac lambda comparator w sygnaturze TreeSeta
        System.out.println(dogos);
    }
}
