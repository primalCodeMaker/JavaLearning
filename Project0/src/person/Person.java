package person;

public abstract class Person implements ConsumingMan {

    private final String name;
    private final String surname;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
