package Warsztat2.functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class BiFunctionExample2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "cat1");
        map.put(2, "cat2");
        map.put(3, "cat3");
        map.put(4, "cat4");

        map.replaceAll((k, v) -> {
            if (k % 2 == 0) {
                v = "dog" + k;
            }
            return v;
        });
        System.out.println(map);
    }
}
