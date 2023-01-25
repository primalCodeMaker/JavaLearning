package generics.List;

import java.util.LinkedList;
import java.util.List;

public class Backpack<T> {

    private List<T> lista = new LinkedList<T>();

    public void put(T element) {
        this.lista.add(element);

    }

}