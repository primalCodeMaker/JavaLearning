package comparingObjects.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorBasics {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("a", "A", "1", "aA", "A1", "a1");

        // zapis 1:
        Comparator<String> myComparator1 = Comparator.naturalOrder();

        // zapis 2:
        // tak mozna zrobic sortowanie odwrocone
        Comparator<String> myComparator2 = myComparator1.reversed();
        Comparator<String> myComparatorRev = myComparator1.reversed();

        // zapis 3:
        // na sztywno ustalamy, jaki typ  bedziemy porownywac
        Comparator<String> myComparator3 = Comparator.<String>naturalOrder();
        Comparator<String> myComparator3Rev = Comparator.<String>naturalOrder().reversed();

        stringList.sort(myComparator1);
        System.out.println(stringList);

        stringList.sort(myComparator3Rev);
        System.out.println(stringList);

    }
}
