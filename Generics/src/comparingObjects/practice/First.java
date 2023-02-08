package comparingObjects.practice;

import java.util.Arrays;
import java.util.Comparator;

public class First implements Comparator<String> {

    public int compare(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return b.compareTo(a);
    }

    public static void main(String[] args) {
        String[] cities = {"WARSZAWA", "ZAKOPANE", "GDYNIA"};
        Arrays.sort(cities, new First());

        System.out.println(Arrays.toString(cities));
    }
}
