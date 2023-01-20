package generics.Interfaces;

public class BagGeneric<T> implements Packable<T> {

    @Override
    public void pack(T element) {

    }

    @Override
    public T empty() {
        return null;
    }
}
