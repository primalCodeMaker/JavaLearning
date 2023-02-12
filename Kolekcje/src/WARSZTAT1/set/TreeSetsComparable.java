package WARSZTAT1.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetsComparable {

    public static void main(String[] args) {
        Set<Dog> dogos = new TreeSet<>();
        dogos.add((new Dog("Czarek", 1)));
        dogos.add((new Dog("Karmel", 2)));
        dogos.add((new Dog("Aron", 3)));
        dogos.add((new Dog("Pimpek", 4)));
        dogos.add((new Dog("Burek", 5)));
        dogos.add((new Dog("Burek",6 )));

        // klasa Dog implementuje Comparator, ktory powornuje tylko imiona
        // gdyby, nie mial zaimplementowanego komparatora w kasie Dog, wywalilo by blad
        // poneiwaz elementy TreeSetu musza implementowac Comparable,
        // lub musimy zdefoniowac lambda comparator w sygnaturze TreeSeta
        System.out.println(dogos);
    }
}
