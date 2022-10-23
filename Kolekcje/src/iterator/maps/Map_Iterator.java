package iterator.maps;

import java.util.HashMap;
import java.util.Map;

public class Map_Iterator {

    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Michal");
        people.put(2, "Angelika");
        people.put(4, "Andrzej");
        people.put(3, "Jola");

        //w Mapach mozna iterowac po kluczach, po wartosciach albo po entry'sach
        for (Integer key : people.keySet()) {
            System.out.println(key);
        }
        for (String value : people.values()) {
            System.out.println(value);
        }
        System.out.println();
        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            System.out.println(entry);
        }
    }
}
