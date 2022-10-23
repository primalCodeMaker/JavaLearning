package mapAndHashmap;

import java.util.*;

public class ListAsValueInMap {

    public static void main(String[] args) {

        Map<String, List<String>> citiesAttractions = new HashMap<>();
        List<String> warsawAttraction = new ArrayList<>();
        warsawAttraction.add("Palac Kultury");
        warsawAttraction.add("Metro Politechnika");
        citiesAttractions.put("Warsaw", warsawAttraction);

        citiesAttractions.put("Gdynia", Arrays.asList("Galeria w ksztalcie statku", "morze"));
        citiesAttractions.put("London", List.of("London EYE", "Big Ben"));

        System.out.println(citiesAttractions);

//        System.out.println(citiesAttractions.get(1));
//        System.out.println(citiesAttractions.get(null));
//        System.out.println(citiesAttractions.get(3.14));
//        System.out.println(citiesAttractions.get("London"));
//        System.out.println(citiesAttractions.values());
//        System.out.println(citiesAttractions.keySet());

        Set<Map.Entry<String, List<String>>> attractionEntries = citiesAttractions.entrySet();
        System.out.println("Entries + " + attractionEntries);
  }
}
