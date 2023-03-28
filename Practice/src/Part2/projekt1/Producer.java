package Part2.projekt1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer<S> {

        private String myString;


       Supplier<String> supplier = () -> myString;


        public String setMyString(String s) {
                return s;
        }

        Consumer<String> consumer1 = s -> System.out.println(s + " consumed");

        Function<String, Integer> function1 = (s -> s.length());


}
