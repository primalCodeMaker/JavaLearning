package Basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamVsCollectrions {

    public static void main(String[] args) {

        Set<String> testSet = new HashSet<>();
        testSet.add("lalala1");
        testSet.add("lalala2");

        Stream<String> testSetStream = testSet.stream();


        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "myValue1");
        testMap.put(1, "myValue2");

        //STREAMA dla mapy inaczej sie inicjalizuje
        Stream<Map.Entry<Integer, String>> testMapStream = testMap.entrySet().stream();
    }
}


