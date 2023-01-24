package generics.List;

public class Backpack <T> {

    private T element;

    T put (T element) {
        this.element = element;
        return element;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "element=" + element +
                '}';
    }
}
