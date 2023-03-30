package Part2.projekt1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyConsumer {

    public void myComsumer1(Consumer<String> c) {
        c.accept("something");
    }

    public void mySupplier1(Supplier<?> s) {
        System.out.println(s.get());
    }

    public void myFunction1(Function<String, String> f) {
        System.out.println(f.apply("hello"));
    }
}
