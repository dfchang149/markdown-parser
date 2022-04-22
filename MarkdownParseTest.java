import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksForTestFile() throws IOException{
        Path fileName = Path.of("C:/Users/chang/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://something.com","some-thing.html"),links); 
    }

    @Test
    public void getLinksForMyTestFile() throws IOException{
        Path fileName = Path.of("C:/Users/chang/OneDrive/Documents/GitHub/markdown-parser/my-test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://test.com","https://test.com"),links); 
    }
}