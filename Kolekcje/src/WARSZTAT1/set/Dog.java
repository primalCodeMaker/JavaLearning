package WARSZTAT1.set;

import java.util.Objects;

public class Dog implements Comparable<Dog>{

    private String name;
    private int age;

    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
         return Objects.hash(name);
        // do przykladu z czasem na zly equals
//        return 1;
    }

    @Override
    public int compareTo(Dog o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

