package generics.List;

//todo 27.30 film
public class Exe {

    public static void main(String[] args) {

        Backpack<Item<Weapons>> backpack = new Backpack<>();

//        Weapons sword = new Weapons(2);
        Item<Weapons> sword = new Item<>(new Weapons(2));
        backpack.put(sword);



    }
}


