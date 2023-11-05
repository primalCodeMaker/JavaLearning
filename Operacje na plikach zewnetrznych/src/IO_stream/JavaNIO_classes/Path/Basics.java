package IO_stream.JavaNIO_classes.Path;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Basics {

    public static void main(String[] args) {

        // Basics
        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath("src/IO_stream/Path/testingFile.txt");

        System.out.println(path.getFileSystem());
        System.out.println(path.getClass());

        // konwersja File na Path
        File file1 = new File("FileToPatch.txt");
        Path path1 = file1.toPath();

        Path path2 = Paths.get("FileToPatch.txt");
        File file2 = path2.toFile();

        // metoda toString()
        String getStrinh = path.toString();
        System.out.println(getStrinh);

        // metoda getNameCount()
        // zlicza ilos katalogow i plikow na sicezce
        System.out.println(path.getNameCount());  // wyswietla 4 dla path

        // metoda getName() << zwraca nazwe katalogu lub pliku na wybranej pozycji
        System.out.println(path.getName(2)); //   0 = src  ||  2 = Path  ||  3 = testingFile.txt

        // metoda getfileName()
        System.out.println(path.getFileName()); // zwraca nazwe ostatniego pliku lub katalogo do ktorego odnosi sie path


        //metoda toAbsolutePath() <<< wymaga aby stworzyc nowa zmienna
        Path abosutePatch = path.toAbsolutePath();
        System.out.println(abosutePatch);

        boolean result = path.isAbsolute();
        System.out.println(result);                      // false
        System.out.println(abosutePatch.isAbsolute());   // true

        // metoda getParent()  <<< zwraca relatywna sciezke do pliku bez mazwy pliku "src\IO_stream\Path"
        System.out.println(path.getParent());

        System.out.println(path.toAbsolutePath().getParent()); // zwraca absolutna sciezke do pliku "D:/Git CloneJavaLearning/Operacje na plikach zewnetrznych/src/IO_stream/Path"

        // metoda subpath()  << zwraca określona dlugosc sciezki
        System.out.println(path.subpath(1,3)); // (1 , 3)- zwraca "src"  ||  (1 , 3)- zwraca "IO_stream\Path"

    }
}
