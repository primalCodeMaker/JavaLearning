package imports;

import Casting.Car; // mozna importowac tylko 1 klase o tej samej nazwie
import Konstruktory.Dog;

public class Main {

    // jak chcemy zrobic Car z innej paczki a juz mamy jeden import o tej samej nazwie to mozemy to zrobic poprzez napisanie sciezki
    Car car = new Car();
    polimorfizm.FirstExample.Car car2 = new polimorfizm.FirstExample.Car("green");

    Dog dog = new Dog();
}
