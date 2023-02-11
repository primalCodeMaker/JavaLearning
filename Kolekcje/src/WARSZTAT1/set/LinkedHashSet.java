package WARSZTAT1.set;

import java.util.Set;

public class LinkedHashSet {

    public static void main(String[] args) {

        Set<String> dogos = new java.util.LinkedHashSet<>();
        dogos.add("dogo1");
        dogos.add("dogo2");
        dogos.add("dogo3");
        dogos.add("dogo3");
        dogos.add("dogo4");
        dogos.add("dogo5");
        dogos.add("dogo6");
        dogos.add("dogo7");
        dogos.add("dogo7");

        System.out.println(dogos);
        // LinkedHashSet zachowuje kolejnosc dodawania
        // nie zachowuje duplikatow

    }
}
