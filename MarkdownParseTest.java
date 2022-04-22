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
    public void testGettingLinks() throws IOException{
        Path fileName = Path.of("C:/Users/chang/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
        String[] expected = {"[https://something.com","some-page.html]"};
	    assertEquals(List.of("https://something.com","some-thing.html"),links); 
    }
}