package Part2.projekt1;

import java.util.Optional;

public class Run {

    public static void main(String[] args) {
        Producer producer = new Producer();

        //fixme klasy Transformer i producer nie maja zadnego sensu.

        System.out.println("-------- PART ONE ------------");

        producer.consumer1.accept("Burger");

        Object functionRun = producer.function1.apply("asdasd");
        System.out.println(functionRun);

        System.out.println(producer.setMyString(() -> "lalalala"));
        System.out.println(producer.getMyString());

        System.out.println("-------- PART TWO ------------");

        Optional<Transformer> transformer = Optional.of(new Transformer("Optimus Prime"));
        System.out.println(transformer);
        System.out.println(transformer.map(transformer.get().transformerFunction(s -> new Producer())));

        System.out.println(transformer.map(t -> t.transformerUnary(u -> "this code doesnt make sense ...")));


    }
}
