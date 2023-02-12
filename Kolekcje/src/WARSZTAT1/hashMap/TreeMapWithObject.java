package WARSZTAT1.hashMap;

import WARSZTAT1.set.Dog;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithObject {

    public static void main(String[] args) {

        Map<Dog, Integer> dogTreeMap = new TreeMap<>((o1, o2) -> o2.getName().compareTo(o1.getName()));

        dogTreeMap.put(new Dog("Wiesiek"), 1);
        dogTreeMap.put(new Dog("Romek"), 2);
        dogTreeMap.put(new Dog("Rusiu"), 5);
        dogTreeMap.put(new Dog("Stefka"), 4);

        // w klasie Dog mamy komparator napisany, ktory sortuje po imieniu, ale sobie napisalismy lambde, ktora sortuje odwrotnie
        System.out.println(dogTreeMap);

    }
}
