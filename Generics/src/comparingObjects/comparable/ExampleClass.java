package comparingObjects.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleClass {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(1,"Roman"));
        dogs.add(new Dog(2,"Stefan"));
        dogs.add(new Dog(3,"Niko"));
        dogs.add(new Dog(4,"Zbyszek"));
        dogs.add(new Dog(5,"Fafik"));
        dogs.add(new Dog(6,"Burek"));
        dogs.add(new Dog(7,"Roman"));

        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}
