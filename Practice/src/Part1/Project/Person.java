package Part1.Project;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {


    Set<Person> personRegistry = new HashSet<>();


    private String name;
    private String surname;
    private int counter;

    public Person(String name, String surname, int counter) {
        this.name = name;
        this.surname = surname;
        this.counter = counter;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCounter() {
        return counter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getSurname(), person.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", counter=" + counter +
                '}';
    }
}
