package Part1.functionalInterfacesExercises.third;

import java.util.Objects;
import java.util.function.BinaryOperator;

public class Third {

    public static void main(String[] args) {

        House house1 = new House(2);
        House house2 = new House(2);
        House house3 = new House(3);

       BinaryOperator<House> binaryOp = (a, b) -> {


           return null;
       };

       binaryOp.apply(house1, house3);

    }

    private static class House {
        private final Integer numberOfRooms;

        public House(Integer numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            House house = (House) o;
            return Objects.equals(numberOfRooms, house.numberOfRooms);
        }

        @Override
        public int hashCode() {
            return Objects.hash(numberOfRooms);
        }

        @Override
        public String toString() {
            return "House{" +
                    "numberOfRooms=" + numberOfRooms +
                    '}';
        }
    }
}
