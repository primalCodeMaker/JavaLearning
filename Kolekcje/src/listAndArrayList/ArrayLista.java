package listAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLista {

    public static void main(String[] args) {

        String first;
        first = "HI";

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        System.out.println(myList);

        ArrayList<Object> objList = new ArrayList<>();
        objList.add(first);
        System.out.println(objList);

    }

}
