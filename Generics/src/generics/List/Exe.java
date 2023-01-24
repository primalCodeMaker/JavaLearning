package generics.List;
//todo 27.30 film
public class Exe {

    public static void main(String[] args) {

        Backpack<Item> backpack = new Backpack<>();
        System.out.println(backpack);

        backpack.put(new Item.Weapons())




    }

    public static class Item<T> {
        private final T type;
        private final Integer space;

        @Override
        public String toString() {
            return "Item{" +
                    "type=" + type +
                    ", space=" + space +
                    '}';
        }

        public Item(T type, Integer space) {
            this.type = type;
            this.space = space;


        }


        public static class Weapons {

        }

        public static class Fruits {

        }
    }

}
