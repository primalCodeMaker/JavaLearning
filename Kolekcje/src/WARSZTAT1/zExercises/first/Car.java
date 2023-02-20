package WARSZTAT1.zExercises.first;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {

    private final String brand;
    private final String model;
    private final int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getYear() == car.getYear() && getBrand().equals(car.getBrand()) && getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getYear());
    }

    @Override
    public int compareTo(Car car) {
        Comparator<Car> carComparator = (o1, o2) -> o1.getYear() - o2.getYear();
        carComparator.thenComparing((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()))
                .thenComparing((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        return carComparator.compare(this, car);
    }
}
