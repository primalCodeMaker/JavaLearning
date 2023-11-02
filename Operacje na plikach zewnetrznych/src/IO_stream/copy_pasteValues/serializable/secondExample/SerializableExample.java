package IO_stream.copy_pasteValues.serializable.secondExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford Mustang", 1960L, List.of(new Door("left"), new Door("right"))));
        cars.add(new Car("VW Garbus", 1984L, List.of(new Door("left"), new Door("right"))));
        cars.add(new Car("Porshe Panamera", 2004L, List.of(new Door("leftFront"), new Door("leftBack"), new Door("rightFront"), new Door("rightBack"))));
        File destination = new File("object file for second example");

//        List<PersianCat> dogs = new ArrayList<>();
//        dogs.add(new PersianCat("Karmel", "Karmelowy"));
//        dogs.add(new PersianCat("Czarek", "Czarny"));
//        dogs.add(new PersianCat("Pimpek", "Ciapaty"));

        serialize(cars, destination);
        System.out.println();
        System.out.println("SERIALIZED");


    }

    private static void serialize(List<?> objects, File destination) throws IOException {
        try (ObjectOutputStream objOutputStream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(destination)))
        ) {
            for (Object object : objects) {
                objOutputStream.writeObject(object);
            }

        }
        for (Object object : objects) {
            System.out.println(object);
        }
    }

}
