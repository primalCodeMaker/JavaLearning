package Warsztat2.methodReference;

public class LambdaExample {

    public static void main(String[] args) {

        MulkProducer producer = () -> "Milk";
        MilkConsumer consumer = arg1 -> "MilkConsumed " + arg1;

        System.out.println(consumer.consume(producer.produce()));
    }

    @FunctionalInterface
    interface MulkProducer {
        String produce();
    }

    @FunctionalInterface
    interface MilkConsumer {
        String consume(String toConsume);
    }
}

