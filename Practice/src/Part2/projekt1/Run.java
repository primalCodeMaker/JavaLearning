package Part2.projekt1;

import java.util.function.Supplier;

public class Run {

    public static void main(String[] args) {

        Producer producer = new Producer();

        producer.consumer1.accept("Burger");

        Object functionRun = producer.function1.apply("asdasd");
        System.out.println(functionRun);

//
//        String supplierRun = producer.setMyString(()-> "ssd");
//        System.out.println(supplierRun);

        Supplier<String> test = () -> {
            String s = "why em I doin this?";
            return s;
        };

        System.out.println(producer.setMyString(test.get()));

    }
}
