package person;

import product.Food;

public class Consumer extends Person {

    private final String expectations;

    public Consumer(String name, String surname, String expectations) {
        super(name, surname);
        this.expectations = expectations;
    }

    public String getExpectations() {
        return expectations;
    }

    @Override
    public void consume(Food food) {
        System.out.println("Consumer Consuming" + food);
    }
}
