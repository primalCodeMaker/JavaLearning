package Generics;

public class Box<T> {

    // inicjujemy obiekt/element typu T, ktory zdefiniujemy podczas wtorzenia instatnci klasy Box
    // podobnie jak z polem klasy
    // podczas tworzenia instancji klasy Box pod typ T podstawimy jakas klase, i wszystkie elementy tej instancji
        // będą musiały już być zgodne z naszym zdefiniowanym typem
    // mozemy zrobic wiele instancji i kazda mzoe miec inny typ T
    private T element;

    public void pack(T element) {
        this.element = element;
    }

        public T getElement() {
            return element;
        }

        public T empty() {
            T element = this.element;
            this.element = null;
            return element;
        }

    @Override
    public String toString() {
        return "Box{" +
                "element=" + element +
                '}';
    }
}
