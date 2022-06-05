import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {

    /*  To Run the tests:
        
        javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
        java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
    */

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksForTestFile() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://something.com","some-thing.html"),links); 
    }

    @Test
    public void getLinksForMyTestFile() throws IOException{
        Path fileName = Path.of("my-test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://test.com","https://test.com"),links); 
    }

    // test test-files 2-8
    @Test
    public void getLinksForTestFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://something.com","some-page.html"),links); 
    }
    @Test
    public void getLinksForTestFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForTestFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("a link on the first line"),links); 
    }
    @Test
    public void getLinksForTestFile9() throws IOException{
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of(),links); 
    }
    @Test
    public void getLinksForSnippet1() throws IOException{
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("`google.com","google.com","ucsd.edu"),links); 
    }
    @Test
    public void getLinksForSnippet2() throws IOException{
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("a.com","a.com(())","example.com"),links); 
    }
    @Test
    public void getLinksForSnippet3() throws IOException{
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = new MarkdownParse().getLinks(content);
	    assertEquals(List.of("https://www.twitter.com","https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
        "https://cse.ucsd.edu/"),links); 
    }

    @Test
    public void testFile566() throws IOException {
        String contents = Files.readString(Path.of("test-files/566.md"));
        List<String> expect = List.of("");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile567() throws IOException {
        String contents = Files.readString(Path.of("test-files/567.md"));
        List<String> expect = List.of("/url1");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
}