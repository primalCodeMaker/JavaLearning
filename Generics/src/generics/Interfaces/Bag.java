package generics.Interfaces;

public class Bag implements Packable<Car> {

    @Override
    public void pack(Car element) {

    }

    @Override
    public Car empty() {
        return null;
    }
}
