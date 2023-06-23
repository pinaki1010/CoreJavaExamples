import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {
        Path currentDir = Paths.get(".");
        //Files.list().forEach(System.out::println);

        //Walk Method

       // Files.walk(currentDir,2).forEach(System.out::println);

        //filter
        Predicate<? super Path> predicate=path -> String.valueOf(path).contains(".java");
        Files.walk(currentDir,2)
                .filter(predicate)
                .forEach(System.out::println);

        //find

        System.out.println("File Finder------>");
        BiPredicate<Path, BasicFileAttributes> matcher = (path,attributes) ->String.valueOf(path).contains(".java");
        Files.find(currentDir,4,matcher).forEach(System.out::println);

        //File Data conatins

        Path currentDirForData = Paths.get("./resources/data.txt");
        List<String> lines=Files.readAllLines(currentDirForData);
        System.out.println("Data are"+lines);
    }
}
