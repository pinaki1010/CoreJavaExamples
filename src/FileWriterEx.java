import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        Path currentFileForData = Paths.get("./resources/data.txt");

       List<String> list= List.of("Sattwiki","Nandan","Hota");

       //write in the file

       Files.write(currentFileForData,list);


        List<String> lines= Files.readAllLines(currentFileForData);

        System.out.println("Data are"+lines);
    }
}
