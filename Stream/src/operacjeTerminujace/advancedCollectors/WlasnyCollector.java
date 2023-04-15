package operacjeTerminujace.advancedCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class WlasnyCollector {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Warszawa", "Wroclaw", "Gdansk", "Lodz", "Wroclaw", "Zakopane");


        TreeSet<String> ownCollector = list.stream()
                .collect(() -> new TreeSet<>(), (a, b) -> a.add(b), (a, b) -> a.addAll(b));

        System.out.println(ownCollector);

    }
}
