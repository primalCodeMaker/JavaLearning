package Part3.IO_Stream_Exercises.seven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SevenResolve {

    /*
    Napisz program, który zliczy ilość słów występujących w pliku.
    Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com
     */

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./src/Part3/workingCatalog/CatalogInside2/anotherFile.txt");

        amountOfWorl(path);

    }

    private static void amountOfWorl(Path path) throws IOException {

        List<String> collect = Files.lines(path)
                .filter(a -> !a.isEmpty())
                .flatMap(lines -> Stream.of(lines.split(" ")))
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect.stream().count());

    }
}
