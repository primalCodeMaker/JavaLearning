public class Main{

    public static void main(String[] args) {

        Dog dog1 = new Dog("Azor");
        System.out.println(Dog.howManyDogsWeHaveGot);
        Dog dog2 = new Dog("Burek");
        System.out.println(Dog.howManyDogsWeHaveGot);
        Dog dog3 = new Dog("Szarik");
        System.out.println(dog1.howManyDogsWeHaveGot);

    }
}