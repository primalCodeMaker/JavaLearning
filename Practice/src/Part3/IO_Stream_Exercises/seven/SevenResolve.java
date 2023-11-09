package Part3.IO_Stream_Exercises.seven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SevenResolve {

    /*
    Napisz program, który zliczy ilość słów występujących w pliku.
    Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com
     */

    public static void main(String[] args) {
        Path path = Paths.get("./src/Part3/workingCatalog/CatalogInside2/anotherFile.txt");

        try {
            amountOfWorl(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void amountOfWorl(Path path) throws IOException {

        List<String[]> collect = Files.lines(path)
                .map(s -> s.split(" "))
                .collect(Collectors.toList())
                .forEach(a -> Arrays.stream(a).count());

//        return count;
    }
}
