package setList;

import java.util.LinkedList;


public class LinkedLista {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();  //CHECK INFO !!

        linkedList.add("Wroclaw");
        linkedList.add("Warszawa");
        linkedList.add("Gdynia");
        linkedList.add("Szczecin");

        System.out.println(linkedList);
        linkedList.addFirst("first element added");
        System.out.println(linkedList);

        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
