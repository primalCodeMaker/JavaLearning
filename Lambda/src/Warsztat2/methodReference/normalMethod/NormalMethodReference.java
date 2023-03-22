package Warsztat2.methodReference.normalMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NormalMethodReference {

    public static void main(String[] args) {
        NormalMethodReference test = new NormalMethodReference();
        test.run();
        System.out.println();
        test.dogList();

    }

    private void run() {
        DogPrinter dogPrinter = new DogPrinter();

        String someDog = Optional.of(new Dog("Burek"))
//                .map(d -> d.getName())
                .map(Dog::getName)
                .orElse("dog with no name :(");
        System.out.println(someDog);

        Optional.of(new Dog("next Burek"))
                .ifPresent(dogPrinter::printDoggy);
    }

    private void dogList() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Karmel"));
        dogs.add(new Dog("Czarek"));
        dogs.add(new Dog("Pimpek"));
        System.out.println(dogs);
            //2 sposoby zapisu
        dogs.sort((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
        dogs.sort(Comparator.comparing(Dog::getName));
        System.out.println(dogs);

    }
}
