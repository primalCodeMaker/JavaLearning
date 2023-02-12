package comparingObjects.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OldIWithTwoCriteria {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(8, "Zbyszek"));
        cats.add(new Cat(3, "Rafal"));
        cats.add(new Cat(4, "Stefan"));
        cats.add(new Cat(5, "Roman"));
        cats.add(new Cat(6, "Karol"));
        cats.add(new Cat(9, "Roman"));
        cats.add(new Cat(7, "Roman"));
        cats.add(new Cat(2, "Roman"));
        System.out.println(cats);

        // klasa anonimowa
        Comparator<Cat> myFirstComparator = new Comparator<Cat>() {  //w sygnatutrze trzeba dopisac typ generyczny
            @Override
            public int compare(Cat o1, Cat o2) {
                // porownywanie stringow:
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getId() - o2.getId();
            }
        });

        cats.sort(myFirstComparator);
        System.out.println(cats);

    }
}
