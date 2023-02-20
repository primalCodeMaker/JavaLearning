package WARSZTAT1.zExercises.first;

import java.util.*;

public class Run {


    public static void main(String[] args) {

        List list2 = listPersoneOne();
        List list1 = listPersoneTwo();


//        Comparator<Car> carComparator = (o1, o2) -> o1.getYear() - o2.getYear();
//        carComparator.thenComparing((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()))
//                .thenComparing((o1, o2) -> o1.getModel().compareTo(o2.getModel()));


        Set<Car> merge = new TreeSet<>();
        merge.addAll(list1);
        merge.addAll(list2);

        for (Car car : merge) {
            System.out.println(car);
        }

    }

    private static List listPersoneOne() {
        List list = new ArrayList();
        PersonOne personOne = new PersonOne();
        return list = personOne.listPersoneOne();
    }

    private static List<Car> listPersoneTwo() {
        PersonTwo personTwo = new PersonTwo();
        List newList = new ArrayList<>();

        for (Object o : personTwo.makeCarsPersonTwo()) {
            newList.add(o);
        }

        return newList;

    }
}