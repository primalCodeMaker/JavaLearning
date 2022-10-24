package first;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element2");
        set.add("element3");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        System.out.println(set);

    }
}
