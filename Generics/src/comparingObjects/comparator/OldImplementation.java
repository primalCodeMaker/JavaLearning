package comparingObjects.comparator;

import java.util.*;

public class OldImplementation {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(2, "Zbyszek"));
        cats.add(new Cat(3, "Rafal"));
        cats.add(new Cat(4, "Stefan"));
        cats.add(new Cat(5, "Roman"));
        cats.add(new Cat(6, "Karol"));


        // klasa anonimowa
        Comparator<Cat> myFirstComparator = new Comparator<>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o2.getId() - o1.getId();
            }
        };

        cats.sort(myFirstComparator);
        System.out.println(cats);

    }
}
