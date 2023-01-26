package generics.Practice.First;

public class Exe {

    public static void main(String[] args) {

        Backpack<Item> backpack = new Backpack<>();

        Backpack<Whales> fishingBoat = new Backpack<>();
        fishingBoat.put(new Whales());

        Item<Weapons> sword = new Weapons(2);
        Item<Fruit> fruit = new Fruit(1);

        Weapons axe = new Weapons(3);
        backpack.put(axe);
        axe.getSpace();

        backpack.put(sword);
        backpack.put(fruit);
        //backpack.put(new Whales());

        System.out.println(backpack);

    }
}