package WARSZTAT1.hashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapa {

    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 123);
        treeMap.put("E", 456);
        treeMap.put("C", 123);
        treeMap.put("D", 1635);
        treeMap.put("B", 12);
        treeMap.put("B", 123);
        System.out.println(treeMap);


    }
}
