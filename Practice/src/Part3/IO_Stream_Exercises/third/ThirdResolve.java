package Part3.IO_Stream_Exercises.third;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ThirdResolve {
    // Napisz program, który na podstawie podanego pliku wydrukuje jego rozmiar w bajtach, kb, mb

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./src/Part3/IO_Stream_Exercises/second/SecondResolve2.java");

        printFilelSize(path);
    }

    private static void printFilelSize(Path path) throws IOException {
        BigDecimal sizeInBytes = BigDecimal.valueOf(Files.size(path));
        BigDecimal sizeInKb = sizeInBytes.divide(BigDecimal.valueOf(1024), RoundingMode.HALF_UP);
        BigDecimal sizeInMb = sizeInKb.divide(BigDecimal.valueOf(1024), RoundingMode.HALF_UP);

        System.out.printf("File %s have size of %s b | %s kb | %s mb", path.getFileName(), sizeInBytes, sizeInKb, sizeInMb);
    }
}
