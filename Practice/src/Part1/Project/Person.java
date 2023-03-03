package Part1.Project;

import java.util.*;

public class Person {

    private static List<Person> personRegistry = new LinkedList<>();

    private String name;
    private String surname;
    private int counter;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

        counter = 0;
        int counter2 = 0;

        if (!personRegistry.contains(this)) {
            this.counter = counter;

        } else {
            for (Person person : personRegistry) {
                counter2 = person.counter +1 ;
               // counter2 = person.getCounter() + 1;
            }
            this.counter = counter2;
        }
        personRegistry.add(this);
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
