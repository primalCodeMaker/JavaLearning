package Part3.IO_Stream_Exercises.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FirstResolve {

    public static void main(String[] args) {

        Path rootPath = Paths.get("./src");
        String fileFinder = "java";

        getAllPaths(rootPath, fileFinder);
    }

    private static void getAllPaths(Path rootPath, String fileFinder) {
        try {
            Files.list(rootPath).forEach(path -> handlePath(path, fileFinder));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void handlePath(Path path, String fileFinder) {
            if (Files.isDirectory(path)) {
                getAllPaths(path, fileFinder);
            } else if (Files.isRegularFile(path) && isFileSpecificExtension(fileFinder, path)) {
                System.out.println(path);
            }
        }

    private static boolean isFileSpecificExtension(String fileFinder, Path path) {
        String[] split = path.getFileName().toString().split("\\.");
        if (split.length != 2) {
            return false;
        }
        return fileFinder.equals(split[1]);
    }

}
