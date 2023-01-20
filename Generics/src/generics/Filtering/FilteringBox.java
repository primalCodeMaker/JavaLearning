package generics.Filtering;
import java.util.function.Predicate;

public class FilteringBox<T, U extends Predicate<T>, V extends Predicate<T>> {

    private T element;
    private final U filter1;
    private final V filter2;

    public FilteringBox(U filter1, V filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    public void pack(T element) {
        if (filter1.test(element) && filter2.test(element)) {
            this.element = element;
        } else {
            throw new RuntimeException("Wrong type dude!");
        }
    }


    @Override
    public String toString() {
        return "FilteringBox{" +
                "element=" + element +
                ", filter1=" + filter1 +
                ", filter2=" + filter2 +
                '}';
    }
}
