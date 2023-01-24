package generics.List;

public class Backpack<T> {

    private T element;

    public void put(T element) {
        this.element = element;

    }

    @Override
    public String toString() {
        return "Backpack{" +
                "element=" + element +
                '}';
    }


    public class Item<T> {
        private T type;

        public void put(T item) {
            this.type = item;

        }

    }

    public class Weapons extends Item {

        private final Integer space;

        public Weapons(Integer space) {
            this.space = space;
        }
    }


    public class Fruits extends Item {

        private final Integer space;

        public Fruits(Integer space) {
            this.space = space;
        }
    }

}