package generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        addFlyingDog(dogs);
        addFlyingDog(animals);

        // mowimy javie ze nie bedziemy uzywac w liscie nic co jest wyzej w hierarhii dziedziczenia niz pies
        List<? super Dog> list1 = dogs;
        List<? super Dog> list2 = animals;
        // List<? super Dog> list3 = new ArrayList<FlyingDog>();  taki zapis nie dziala

        list1.add(new Dog());
        list1.add(new FlyingDog());
        // list1.add(new Animal()); Animal jest rodzicem Doga i nie mozna tego elementu dodac do listy
        // bo jest wyzej w hierarhii dziedziczenia

    }

    private static void addFlyingDog(List<? super Dog> list) {
        list.add(new FlyingDog());

    }

    static class Animal {

    }

    static class Dog extends Animal {

    }

    static class FlyingDog extends Dog {

    }
}
