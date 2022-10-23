package iterator.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Set_Iterator {

    public static void main(String[] args) {

        Set<String> setList = new HashSet<>();
        setList.add("Wroclaw");
        setList.add("Warszawa");
        setList.add("Gdynia");
        setList.add("Szczecin");

        // Set nie ma metody Get, bo Set nie z  zachowuje kolejnosci
        //metoda iterator:

        Iterator<String> iterator = setList.iterator();
        // po zainicjowaniu iteratora nie mozna dopisywać rzeczy do seta bo wywali wyjatek ConcurrentModificationException
        // setList.add("asda");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
