import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilePathTest {

    @Test
    public void testPath(){
        String folder = "logs";
        String fileName = "history.log";

        String expectedPath = folder + "\\" + fileName;

        File file = new File(folder, fileName);

        assertEquals(expectedPath, file.getPath(), "The path is not available current OS");
    }
}
