package Part1.Project;

import java.util.*;

public class Person {

    private static List<Person> personRegistry = new LinkedList<>();

    private String name;
    private String surname;
    private int counter;
    private String vip;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

        addCounter(this);
    }

    public Person(String name, String surname, String vip) {
        this.name = name;
        this.surname = surname;
        this.vip = vip;

        addCounter(this);
    }

    private static int addCounter(Person person) {
        int counter = 0;
        if (!personRegistry.contains(person)) {
            person.counter = counter;

        } else {
            for (Person element : personRegistry) {
                if (person.equals(element)) {
                    counter = element.getCounter();
                    counter++;
                }
            }
            person.counter = counter;
        }
        personRegistry.add(person);
        return person.counter = counter;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCounter() {
        return counter;
    }

    public boolean getVip() {
        if (!vip.equals(null)) {
            return false;
        } else {
            return true;
        }

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

        if (vip != null) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", counter=" + counter +
                    ", VIP" +
                    '}';
        } else {

            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", counter=" + counter +
                    '}';
        }
    }
}
