package WARSZTAT1.nullExample;

import java.util.Set;
import java.util.TreeSet;

public class Null2 {

    public static void main(String[] args) {

        // ten przyklad doda nulla do naszej listy na poczatku bo

        Set<Integer> treeSetWithNull = new TreeSet<>((o1, o2) -> {
            if (o1 == null || o2  != null) {
                System.out.println("null finfded!!");
                return -1;  // jesli tuaj dodamy return 1, nulle beda na wlasciwej pozycji zgodnie z dodawaniem do treeSeta

            } if (o1 != null || o2  == null) {
                System.out.println("null finfded!!");
                return 1;

            } if (o1 == null || o2  == null) {
                System.out.println("null finfded!!");
                return 0;
            }
            return o1 - o2;
        });

        treeSetWithNull.add(1);
        treeSetWithNull.add(null);
        treeSetWithNull.add(4);
        treeSetWithNull.add(3);
        treeSetWithNull.add(2);
        treeSetWithNull.add(null);

        System.out.println(treeSetWithNull);
    }
}
