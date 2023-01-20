package generics.Interfaces;

public interface Packable<T> {

    void pack(T element);

    T empty();
}
