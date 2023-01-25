package generics.Practice.First;

import java.util.ArrayList;
import java.util.List;

public class Backpack<T> {

    private List<T> lista = new ArrayList<T>();

    public void put(T element) {
        this.lista.add(element);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "lista=" + lista +
                '}';
    }
}