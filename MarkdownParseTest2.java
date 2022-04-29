import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest2 {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksForTestFile() throws IOException{
        System.out.println("Running test 1");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://something.com","some-thing.html"),links); 
    }

    @Test
    public void getLinksForMyTestFile() throws IOException{
        System.out.println("Running test 2");
        Path fileName = Path.of("my-test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://test.com","https://test.com"),links); 
    }

    // test test-files 2-8
    @Test
    public void getLinksForTestFile2() throws IOException{
        System.out.println("Running test 3");
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://something.com","some-page.html"),links); 
    }
    @Test
    public void getLinksForTestFile3() throws IOException{
        System.out.println("Running test 4");
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile4() throws IOException{
        System.out.println("Running test 5");
        Path fileName = Path.of("C:/Users/chang/OneDrive/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse2().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile5() throws IOException{
        System.out.println("Running test 6");
        Path fileName = Path.of("C:/Users/chang/OneDrive/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse2().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile6() throws IOException{
        System.out.println("Running test 7");
        Path fileName = Path.of("C:/Users/chang/OneDrive/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse2().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile7() throws IOException{
        System.out.println("Running test 8");
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile8() throws IOException{
        System.out.println("Running test 9");
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("a link on the first line"),links); 
    }
}