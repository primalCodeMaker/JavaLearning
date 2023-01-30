package generics.Practice.Second;

import java.util.*;

public class Second<T> {
// przykłady zapisu

    public static void main(String[] args) {

        new Second();
        System.out.println(new Second<Integer>());
        System.out.println(new Second());
        //System.out.println(new Second(T));  trzeba zdefiniowac typ na tym etapie


        List<String> x = new LinkedList<String>();
//        List<Object> xy = new ArrayList<String>();  musi byc Object

        Set<? extends Number> number = new HashSet<Integer>();
        HashSet<? super NullPointerException> c = new HashSet<Exception>();

//--------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------

            // metody w kolekcjach
        Second second = new Second();
        List<? super Second> list = new ArrayList<>();
        //Collection<? super Second> list2 = new ArrayList<>();   musi byc List
        second.print(list);

    }

    public void print(List<?> list) {
        System.out.println(list.get(0));
    }
}
