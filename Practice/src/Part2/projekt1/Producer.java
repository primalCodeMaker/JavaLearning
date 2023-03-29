package Part2.projekt1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer {

    private static String myString;

    Supplier<String> sup1 = () -> "as";


    public  String setMyString(String s) {
        Supplier<String> ss = () -> "asd";
        return ss.get();
    }


    Consumer<String> consumer1 = s -> System.out.println(s + " consumed");

    Function<String, Integer> function1 = (s -> s.length());


    public String getMyString() {
        return myString;
    }
}
