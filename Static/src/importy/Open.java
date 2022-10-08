package importy;

import static importy.Animal.*;
import static importy.Dog.*;   // jesli mamy 2 takie same nazwy stalych to nie mozwmy zrobic imoprtow z roznych kals
import static importy.Dog.woof;


public class Open {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(NAME);
        System.out.println(SURNAME);
        System.out.println(Animal.AGE);
        woof();
    }
}
