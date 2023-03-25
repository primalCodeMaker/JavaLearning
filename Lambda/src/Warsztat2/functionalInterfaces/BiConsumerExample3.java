package Warsztat2.functionalInterfaces;

import java.util.HashMap;
import java.util.Map;

public class BiConsumerExample3 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "cat");
        map.put(2, "cat2");
        map.put(3, "dog");
        map.put(4, "cat3");

        map.forEach((k, v) -> {

            if (v.contains("cat")) {
                System.out.println(k + " " + " " + v + " Meow Meow!");
            } else if (v.contains("dog")) {
                System.out.println(k + " " + " " + v + " Woof Woof!");
            }
        });
    }
}