package generics.Practice.First;

public class Item<T> {

    private T type;

    public void Item(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                '}';
    }
}
