package Final.immutableClass;

public class Main {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Zenek", "Ola");
        System.out.println(cat1);

        cat1.newName("DArek", "Zosia");
        System.out.println(cat1);  // nie mozna zmienic pol klasy immutable poprzez meody

        cat1 = new Cat("asd", "asd");
        System.out.println(cat1); // mozna to zrobic natomiast poprzez zmiane referencj cat1 na nowy opbiekt klasy immutable Cat


        System.out.println();
        cat1 = cat1.newOwner("Burek", "Angela");
        System.out.println(cat1);

        cat1 = cat1.newName("Lysy", "this.owner");
        System.out.println(cat1);

    }

}