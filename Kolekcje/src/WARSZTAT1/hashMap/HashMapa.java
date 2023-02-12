package WARSZTAT1.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapa {

    public static void main(String[] args) {

        Map<String, String> someMap = new HashMap<>();
        someMap.put("1", "ABC");
        someMap.put("2", "DEF");
        someMap.put("3", "GHI");
        someMap.put("4", "JKL");
        System.out.println(someMap);
        System.out.println();

        for (String s : someMap.values()) {
            System.out.print(s + ",");
        }
        System.out.println();

        for (Map.Entry<String, String> entry : someMap.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");

        }

        someMap.getOrDefault(5, "nie ma");
    }
}
