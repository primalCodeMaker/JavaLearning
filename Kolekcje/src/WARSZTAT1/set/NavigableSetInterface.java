package WARSZTAT1.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {

    public static void main(String[] args) {

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <= 100; i++) {
            navigableSet.add(i);
        }

        System.out.println(navigableSet.lower(50));     // 49
        System.out.println(navigableSet.floor(50));     // 50
        System.out.println(navigableSet.ceiling(90));   // 90
        System.out.println(navigableSet.higher(90));    // 91
        System.out.println(navigableSet.ceiling(100));  // 100
        System.out.println(navigableSet.higher(100));   // null

    }
}
