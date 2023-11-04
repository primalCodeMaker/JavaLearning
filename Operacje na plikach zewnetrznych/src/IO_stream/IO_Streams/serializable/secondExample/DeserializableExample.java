package IO_stream.IO_Streams.serializable.secondExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeserializableExample extends SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File frozenObjects = new File("object file for second example");

        List<Car> deserialize = deserialize(frozenObjects);
        System.out.println(deserialize);

    }

    private static List<Car> deserialize(File frozenObjects) throws IOException, ClassNotFoundException {
        List<Car> result = new ArrayList<>();

        try (ObjectInputStream objInputStream = new ObjectInputStream
                (new BufferedInputStream
                        (new FileInputStream(frozenObjects)))
        ) {
            while (true) {
                Object object = objInputStream.readObject();
                if (!(object instanceof Car)) {
                    System.out.println("object is not concrete!");
                    continue;
                }
                Car concreteObject = (Car) object;
                System.out.println("successfully concreteObject " + concreteObject);
                result.add((Car) object);
            }
        } catch (EOFException e) { //wyjatek oznaczajacy koniec pliku
            System.out.println("End of File");
        }
        return result;
    }
}
