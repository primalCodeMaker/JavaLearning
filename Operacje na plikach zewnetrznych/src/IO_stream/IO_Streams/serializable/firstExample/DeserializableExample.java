package IO_stream.IO_Streams.serializable.firstExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeserializableExample extends SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File frozenObjects = new File("no mather what is here");

        List<Car> deserializeCars = deserialize(frozenObjects);
        System.out.println(deserializeCars);

    }

    private static List<Car> deserialize(File frozenObjects) throws IOException, ClassNotFoundException {
        List<Car> carList = new ArrayList<>();

        try (ObjectInputStream objInputStream = new ObjectInputStream
                (new BufferedInputStream
                        (new FileInputStream(frozenObjects)))
        ) {
            while (true) {
                Object object = objInputStream.readObject();
                if (!(object instanceof Car)) {
                    System.out.println("object is not Car!");
                    continue;
                }
                Car carRead = (Car) object;
                System.out.println("successfully read car: " + carRead);
                carList.add((Car) object);
            }
        } catch (EOFException e) { //wyjatek oznaczajacy koniec pliku
            System.out.println("End of File");
        }
        return carList;
    }
}
