package examples.first;

import java.util.function.Predicate;

public class Cat {
    int age;

    public Cat(final int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat cat = new Cat(4);
        check(cat, c -> c.age <5);
    }
    private static void check(Cat cat, Predicate<Cat> predicate) {
        System.out.println(predicate.test(cat) ? "OK" : "NOT OK");
    }
}
