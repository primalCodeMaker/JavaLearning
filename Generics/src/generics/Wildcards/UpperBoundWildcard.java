package generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Monkey> monkeys = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<ImplementingVoiceable> implementingVoiceables = new ArrayList<>();

        print(animals);
        print(dogs);
        print(monkeys);
        // print(strings);   <<<   string nie rozszerza Animal wiec nie mozna tej listy uzyc w metodzie
        // print(implementingVoiceables);

        List<? extends Animal> reList = dogs;
        dogs.add(new Dog());
//        reList.add(new Dog());  <<< nie dziala dodawanie z operatorem <?>

    }
        // zapis "? extends" pozwala na uzywanie w metodzie instatncji wszystkich klas, ktore rozszerzaja klase bazowa
    private static void print(List<? extends Animal> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    static class Animal implements Voiceable {

    }

    static class Monkey extends Animal {

    }

    static class Dog extends Animal {

    }

    static class ImplementingVoiceable implements Voiceable {

    }

    interface Voiceable {

    }
}
