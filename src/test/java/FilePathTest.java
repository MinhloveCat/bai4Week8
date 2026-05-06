import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FilePathTest {

    @Test
    public void testPath(){
        String folder = "logs";
        String fileName = "history.log";

        Path expectedPath = Paths.get("logs", "history.log");
        Path actualPath = Paths.get(folder, fileName);



//        assertEquals(actualPath,expectedPath , "The path is not suitable for current OS");
        assertEquals(expectedPath, actualPath,"Matching!!!");
    }
}
