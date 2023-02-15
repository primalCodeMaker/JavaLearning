package WARSZTAT1.nullExample;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Null1 {

    public static void main(String[] args) {

        // ten przyklad nie doda nula do naszej listy
        Set<Integer> treeSetWithNull = new TreeSet<>((o1, o2) -> {
            if (o1 == null || o2  == null) {
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
