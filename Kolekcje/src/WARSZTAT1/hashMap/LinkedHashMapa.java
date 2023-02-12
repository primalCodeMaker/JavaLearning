package WARSZTAT1.hashMap;

import WARSZTAT1.set.Dog;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapa {

    public static void main(String[] args) {

        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("A", 123);
        linkedMap.put("E", 123);
        linkedMap.put("C", 123);
        linkedMap.put("D", 123);
        linkedMap.put("B", 123);
        linkedMap.put("B", 123);

        System.out.println(linkedMap);

        Map<Dog, String> linkedObject = new LinkedHashMap<>();

        Dog Azor = new Dog("Azor");
        Dog Karmel = new Dog("Karmel");
        Dog Czarek = new Dog("Czarek");
        Dog Pimpek = new Dog("Pimpek");

        linkedObject.put(Pimpek, "Woof");
        linkedObject.put(Karmel, "Woof");
        linkedObject.put(Czarek, "Woof");
        linkedObject.put(Azor, "Woof");

        for (Dog dog : linkedObject.keySet()) {
            System.out.println(dog);
        }
    }
}
