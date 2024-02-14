package pl.lombok;

public class MainForDog {

    public static void main(String[] args) {

        Owner owner = new Owner();
        Dog dog1 = new Dog("Karmel", 7, owner);
        Dog dog2 = new Dog("Karmel", 7, owner);

        System.out.println(dog1.equals(dog2));

        System.out.println(dog1);
        Dog dog3 = dog1.withName("nowy piesek");

        System.out.println(dog1 + " || " + dog3);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
        
    }
}
