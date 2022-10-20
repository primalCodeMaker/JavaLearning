package mapAndHashmap;

import java.util.*;

public class ListInValue {
    public static void main(String[] args) {

        Map<Integer, List<String>> listMap = new HashMap<>();
        listMap.put(1, List.of("number1", "number2", "number6"));
        listMap.put(2, Collections.emptyList());
        listMap.put(3, Collections.singletonList("Norbert Rafalski"));

        System.out.println(listMap);

        for (Map.Entry<Integer, List<String>> integerListEntry : listMap.entrySet()) {
            System.out.println(integerListEntry);

        }
        System.out.println();
        Set<Integer> inyeegers = listMap.keySet();
        System.out.println(inyeegers);

        System.out.println(listMap.values());
        System.out.println();

        Set<Integer> integers = listMap.keySet();
        for (List<String> value : listMap.values()) {
            System.out.println(value);

        }

    }
}
