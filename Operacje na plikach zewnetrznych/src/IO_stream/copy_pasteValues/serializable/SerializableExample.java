package IO_stream.copy_pasteValues.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford Mustang", 1960L, List.of(new Door("left"), new Door("right"))));
        cars.add(new Car("VW Garbus", 1984L, List.of(new Door("left"), new Door("right"))));
        cars.add(new Car("Porshe Panamera", 2004L, List.of(new Door("leftFront"), new Door("leftBack"), new Door("rightFront"), new Door("rightBack"))));

        File destination = new File("no mather what is here");

        serializeCars(cars, destination);


    }

    private static void serializeCars(List<Car> cars, File destination) throws IOException {
        try (ObjectOutputStream objOutputStream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(destination)))
        ) {
            for (Car car : cars) {
                objOutputStream.writeObject(car);
            }

        }
    }
}
