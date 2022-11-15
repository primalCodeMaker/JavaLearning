package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class List {

    public static void main(String[] args) {

        java.util.List<String> myList = new ArrayList<>();
        myList.add("Angelika");
        myList.add("");
        myList.add("Amelka");
        myList.add("");
        myList.add("Michal");

        // pierwszy przyklad predykatu, ktory sprawdza, czy na danej pozycji wpis w liscie zaczyna sie od A
        Predicate<String> myPredicate = (s) -> s.startsWith("A");
        System.out.println(myPredicate.test(myList.get(2)));
        System.out.println();

        // 2gi przyklad predykatu, ktory usowa puste elementy
        Predicate<String> secondPredicateRemoveEmpty = remove -> {
            System.out.println("isEmty_Checking: " + remove + " " + remove.isEmpty());
            return remove.isEmpty();
        };

        System.out.println("Full List: " + myList);
        myList.removeIf(secondPredicateRemoveEmpty);
        System.out.println(myList);

    }
}