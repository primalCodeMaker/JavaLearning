package generics.Filtering;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        callingFilteringBox();

    }

    private static void callingFilteringBox() {
        Car car = new Car("Red", 2020);
        FilteringBox<Car, Predicate<Car>, Predicate<Car>> filteringBox = new FilteringBox<>(
                c -> c.getColor().equals("Red"),
                c -> c.getYear().equals(2020)
        );
        filteringBox.pack(car);
    }


    static class Car {

        private String color;
        private Integer year;

        public Car(String color, Integer year) {
            this.color = color;
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public Integer getYear() {
            return year;
        }
    }

}