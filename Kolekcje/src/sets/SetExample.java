package sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Wrocław");
        set1.add("Wrocław");
        set1.add("Szczecin");
        set1.add("Szczecinek");
        set1.add("Warshawa");

        System.out.println(set1.contains("Wrocław"));
        System.out.println(set1.contains("wrocław"));

        Set<String> set2 = new HashSet<>();
        set2.add("Gdynia");
        set2.add("Gdansk");
        set2.add("Glogow");
        set2.add("Gggggggg");
        set2.add("Wrocław");

        // addAll laczy ze soba 2 sety i zwraca boolina
        Set<String> union = new HashSet<>(set1);
        System.out.println(union);
        union.addAll(set2);
        System.out.println(union);

        //retain all zwraca duplikaty
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // pokazuje tylko unilatowe wartosci
        Set<String> difference = new HashSet<>(set2);
        difference.removeAll(set1);
        System.out.println(difference);

        }


}
