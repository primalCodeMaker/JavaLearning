package Part3.IO_Stream_Exercises.six;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SixResolve {
    /*
    Napisz program, który zastąpi zawartość pliku tym samym tekstem ale w całości napisanym wielką literą.
    Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com/.
     */

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./src/Part3/workingCatalog/CatalogInside2/anotherFile.txt");

        toUpperCase(path);

    }
    private static void toUpperCase(Path path) throws IOException {
        Files.lines(path)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
