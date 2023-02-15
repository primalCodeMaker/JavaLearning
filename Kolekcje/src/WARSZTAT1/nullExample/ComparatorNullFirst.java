package WARSZTAT1.nullExample;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ComparatorNullFirst {

    public static void main(String[] args) {

        // tutaj definiujemy sobie Comparator.nullfirst jako sposob porownania obiektow w drzewie
        Map<Integer, String> treeMap = new TreeMap<>(Comparator.nullsFirst(Comparator.naturalOrder()));

        treeMap.put(null, "ulala");
        treeMap.put(1, "ulala");
        treeMap.put(2, null);
        treeMap.put(null, "nadpisanyNull");
        System.out.println(treeMap);
    }
}




