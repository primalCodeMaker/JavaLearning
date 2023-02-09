package WARSZTAT1.arrayListLinkedList;

import java.util.*;


public class ArrayLista {

    public static void main(String[] args) {

             // sposoby inicjalizacji immutable:
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = List.of("a", "b", "c");
        List<String> list3 = Collections.singletonList("a");
        List<String> list4 = Collections.emptyList();

            // mutowalne
        List<String> list5 = new LinkedList<>();
        List<String> list6 = new ArrayList<>();

            // glowne metody:
        list6.add("a");
        list6.add("b");
        list6.add("c");
        list6.add(2,"d");
        System.out.println(list6.get(3)); // zwroci "c"
        System.out.println(list6.indexOf("d")); // 2 - zwraca na jakim indeksie jest d
        list6.remove("a");   // usinie obiekt
        list6.remove(1);   // usunie wartosc na indeksie 1
        System.out.println(list6.size());   // zwraca wielkosc listy
        System.out.println(list6.lastIndexOf("c"));  // zwraca na jakim miejscu jest ostatnie c
        System.out.println(list6.indexOf("c"));  // zwraca na jakim miejscu jest pierwsze c
        list6.set(1, "set"); // zamienia element z podanego indexu na nowy element
        System.out.println(list6);

    }
}
