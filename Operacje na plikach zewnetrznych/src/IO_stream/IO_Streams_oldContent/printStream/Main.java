package IO_stream.IO_Streams_oldContent.printStream;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("PrinterStreamExample.txt");
        try (PrintWriter printWriter = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file)))) {

            printWriter.print(1L);
            printWriter.write(String.valueOf(1L));

            Car car = new Car("Samochod Stefan");
            printWriter.print(car);

            printWriter.println();

            printWriter.println("zajavka");

            printWriter.printf("some value: %s%n ", car.toString());

        }
    }
}

