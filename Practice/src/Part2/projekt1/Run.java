package Part2.projekt1;

import java.util.function.Supplier;

public class Run {

    public static void main(String[] args) {

        Producer producer = new Producer();

        producer.consumer1.accept("Burger");

        Object functionRun = producer.function1.apply("asdasd");
        System.out.println(functionRun);

        Supplier something = producer.supplier1("Something");
        System.out.println(something);
    }
}
