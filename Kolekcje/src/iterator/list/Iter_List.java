package iterator.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iter_List {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Wroclaw");
        cities.add("Warszawa");
        cities.add("Gdynia");
        cities.add("Szczecin");

        // pierwszy sposob iter:
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println();

        // spsob 2 fori (intelliJ podpowiada aby to przerobic na iter):
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.println();

        // sposob 3 iterator:
        Iterator<String> iterator = cities.iterator(); // mozna uzyc metody listIterator i ona dodaje dodatkowe opcje next / previous / set
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        ListIterator<String> iterator2 = cities.listIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("--------------"); //drukowanie od tylu. Trzeba najpierw zrobic petle do przodu aby zadzialalo
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }
    }
}
