package generics.Practice.First;

public class Fruit extends Item {

    private final Integer space;

    public Fruit(Integer space) {
        this.space = space;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "space=" + space +
                '}';
    }
}

