package Warsztat2.methodReference;

public class StaticMethodReference {

    public static void main(String[] args) {

        MulkProducer producer = StaticMethodReference::staticMilkReference;
        MilkConsumer consumer = StaticMethodReference::staticMilkReferenceConsumer;

        System.out.println(producer.produce());
        System.out.println();
        System.out.println(consumer.consume("Milk as argument in method"));
    }

    public static String staticMilkReference() {
        System.out.println("Calling Static method ");
        return "StaticMilk";
    }

    public static String staticMilkReferenceConsumer(String toconsume) {
        System.out.println("Calling Static method for consumer ");
        return toconsume;
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
