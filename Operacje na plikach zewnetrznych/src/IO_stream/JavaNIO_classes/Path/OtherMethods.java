package IO_stream.JavaNIO_classes.Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OtherMethods {

    public static void main(String[] args) {

        Path path1 = Paths.get("src/IO_stream/Path/testingFile.txt");
        Path path2 = Paths.get("src/IO_stream/Path/testingDirectory/testingFile.txt");


        // metoda relativize() << pokazuje jakie kroki trzeba podjac zeby z jednej siezki dostac sie do drugiej
        // mozna pracowac na sciezkach absolutnych i rowniez na relatywnych
        // ale jak podajemy absolutna lub relatywna to obie musza byc takie same
        // przy pracy na sciezkach relatywnych, lub jesli tylko pierwsza bedzie absolutna to druga sciezka dokleja sie do pierwszej
        // jeslu druga sciezka bedzie absolutna to nic sie nie stane, program zaczyta informacje ze sciezki 2

        Path path1absolute = path1.toAbsolutePath();
        Path path2absolute = path2.toAbsolutePath();

        System.out.println(path1absolute);
        System.out.println(path2absolute);
        System.out.println(path1absolute.relativize(path2absolute));

        // metoda normalize()
        Path damagedPath = Paths.get("src/../src/IO_stream/Path/testingFile.txt");
        System.out.println(damagedPath);                // drukuje sciezke z wyjsciem z katalogu src
        System.out.println(damagedPath.normalize());    // naprawia sciezke tak jak powinna wygladac

        // metoda Files.exists()
        System.out.println(Files.exists(path1absolute));   //true bo jest tam plik
        System.out.println(Files.exists(path2absolute));   // false bo nie ma takiego pliku

        //metoda toRealPath() << sprawdza czy sciezka istnieje na dysku
        // wymaga obsluzenie wyjatku

        try {
            System.out.println(path1.toRealPath());
          //  System.out.println(path2.toRealPath());     // to zuca bledem bo nie ma pliku
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
