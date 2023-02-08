package comparingObjects.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaImplementation {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "Roman"));
        cats.add(new Cat(6, "Zbyszek"));
        cats.add(new Cat(3, "Rafal"));
        cats.add(new Cat(2, "Stefan"));
        cats.add(new Cat(5, "Roman"));
        cats.add(new Cat(4, "Karol"));

        // 1 kryterium sortowania: (2 sposoby zapisu + Revers)
        Comparator<Cat> lambdaBasic = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Cat> myLambdaComparator = Comparator.comparing(cat -> cat.getName());
        Comparator<Cat> myLambdaComparatorRev = Comparator.comparing((Cat cat) -> cat.getName()).reversed();

        //2 kryteria sortowania:
        Comparator<Cat> lambdaBasic1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
        lambdaBasic1 = lambdaBasic1.thenComparing((o1, o2) -> o1.getId() - o2.getId());

        Comparator<Cat> myLambdaComparator2;
        myLambdaComparator2 = Comparator.<Cat, String>comparing(cat1 -> cat1.getName())
                .thenComparingInt(cat -> cat.getId());

        System.out.println(cats);
        cats.sort(myLambdaComparator2);
        System.out.println(cats);
    }
}
