package tasks.task4;

import org.junit.After;
import org.junit.jupiter.api.*;

import java.util.*;

public class TestClient {
    NewspaperArticle article1, article2;

    @BeforeEach
    public void setup() {
        String title = "Software maintenance is fun!";
        String author = "John Doe";
        int startPage = 5;
        int endPage = 6;
        Set<String> editors = new HashSet<String>();
        editors.add("Rachel Smith");
        editors.add("Arvind Bhusnurmath");
        String newspaper = "The edX Times";
        Date date = new Date();
        String city = "Philadelphia";
        String state = "PA";
        String postCode = "19104";

        article1 = new NewspaperArticle(title, author, startPage, endPage, editors, newspaper, date, city, state, postCode);
        article2 = new NewspaperArticle(title, author, startPage, endPage, editors, newspaper, date, city, state, postCode);
    }

    @After
    public void cleanup() {
    }

    @Test
    public void testTest() {
        Client client = new Client();
        client.test();
    }

    @Test
    public void testCompare() {
        Client client = new Client();
        client.compare(article1, article2);
    }
}
