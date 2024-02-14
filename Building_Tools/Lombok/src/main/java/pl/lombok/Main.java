package pl.lombok;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Lombok! :D");

        Owner owner = new Owner();

        Cat cat = new Cat("Kotek", owner);
        Cat cat1 = new Cat();
        Cat cat2 = Cat.of("Koteczek" , 15, owner);


        String name = cat.getName();
        System.out.println(name);
        cat.setAge(10);

        System.out.println(cat);
        System.out.println(cat1);

        cat.nonNullExample("sth not null");
    }
}
