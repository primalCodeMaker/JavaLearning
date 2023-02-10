package WARSZTAT1.set;

import java.util.Objects;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
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
//         return Objects.hash(name);
        // do przykladu z czasem na zly equals
        return 1;
    }
}

