package operacjePosrednie.mapSecondExample;

public class Person {

    private final String name;
    private final City city;


    public Person(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
