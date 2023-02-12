package comparingObjects.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a", "A", "1", "aA", "A1", "a1");
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);

    }
}
