package mapAndHashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Example {

    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Michal");
        people.put(2, "Angelika");
        people.put(4, "Andrzej");
        people.put(3, "Jola");
        people.put(null, "Aga");
        people.put(null, "OLA ");

        Set<String>set = new HashSet<>();
        set.add("asdasd");
        set.add("vbcvb");

        // nie da sie dodac seta do Mapy
//        Map<Integer, String> anorherPeople = new HashMap<>((Map) set);
//        System.out.println(anorherPeople);

        Map<Integer, String> anorherPeople = new HashMap<>(people);
        System.out.println(anorherPeople);

        System.out.println(people.get(1));
        people.remove(4);
        System.out.println(people);
        System.out.println(people.isEmpty());

        System.out.println(people.containsKey(6));
        System.out.println(people.containsValue("OLA "));


    }
}
