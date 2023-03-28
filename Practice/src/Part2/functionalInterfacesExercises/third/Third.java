package Part2.functionalInterfacesExercises.third;

import java.util.*;
import java.util.function.BinaryOperator;

public class Third {

    public static void main(String[] args) {

        House house1 = new House(2);
        House house2 = new House(2);
        House house3 = new House(3);

        BinaryOperator<House> binaryOp = (a, b) -> {
            return whichHousisBiggest(a, b);
        };

        House selectHouse = binaryOp.apply(house1, house3);
        House checking = Optional.ofNullable(selectHouse).orElseThrow(() -> new RuntimeException("AHTUNG NULL"));
        System.out.println(checking);

    }

    private static House whichHousisBiggest(House a, House b) {
        List<House> newList = new ArrayList<>();
        newList.add(a);
        newList.add(b);
        if (!a.equals(b)) {
            Comparator<House> bigest = ((h1, h2) -> h1.numberOfRooms.compareTo(h2.numberOfRooms));
            newList.sort(bigest.reversed());
            return newList.get(0);
        } else {
            return null;
        }
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

        public Integer getNumberOfRooms() {
            return numberOfRooms;
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
