package IO_stream.Path;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Basics {

    public static void main(String[] args) {

        // Basics
        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath("/src/IO_stream/Path/testingFile.txt");
        System.out.println(path.getFileSystem());
        System.out.println(path.getClass());

        // konwersja File na Path
        File file1 = new File("FileToPatch.txt");
        Path path1 = file1.toPath();

        Path path2 = Paths.get("FileToPatch.txt");
        File file2 = path2.toFile();

    }
}
