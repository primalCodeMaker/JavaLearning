package Part2.projekt1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer {

    private static String myString;


    public String setMyString(Supplier<String> s) {
        myString = s.get();
        return s.get();
    }

    Consumer<String> consumer1 = s -> System.out.println(s + " consumed");

    Function<String, Integer> function1 = (s -> s.length());

    public String getMyString() {
        return myString;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "consumer1=" + consumer1 +
                ", function1=" + function1 +
                '}';
    }
}
