package Part2.functionalInterfacesExercises.first;

import java.util.function.BiFunction;

public class First {

    public static void main(String[] args) {

        BiFunction<Integer, Double, String> numbersToString = First::numbersToStringMethod;
        System.out.println(numbersToString.apply(1, 5.5));

    }

    private static String numbersToStringMethod(Integer i, Double d) {
        System.out.println("Integer parameter = " + i);
        System.out.println("Double parameter = " + d);
        return i.toString().concat(d.toString());
    }
}
