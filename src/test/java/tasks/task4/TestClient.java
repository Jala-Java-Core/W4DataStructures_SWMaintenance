package tasks.task4;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestClient {
    @BeforeEach
    public void setup() {
    }

    @After
    public void cleanup() {

    }

    @Test
    public void Test() {
        Client client = new Client();
        client.test();
    }

    @Test
    public void compare() {

        String title1 = "Software maintenance is fun!";
        String author1 = "John Doe";
        int startPage1 = 5;
        int endPage1 = 6;
        Set<String> editors1 = new HashSet<String>();
        editors1.add("Rachel Smith");
        editors1.add("Arvind Bhusnurmath");
        String newspaper1 = "The edX Times";
        Date date1 = new Date();
        String city1 = "Philadelphia";
        String state1 = "PA";
        String postCode1 = "19104";
        NewspaperArticle article1 = new NewspaperArticle(title1, author1, startPage1, endPage1, editors1, newspaper1, date1, city1, state1, postCode1);


        String title2 = "Software maintenance is fun!";
        String author2 = "John Doe";
        int startPage2 = 5;
        int endPage2 = 6;
        Set<String> editors2 = new HashSet<String>();
        editors2.add("Rachel Smith");
        editors2.add("Arvind Bhusnurmath");
        String newspaper2 = "The edX Times";
        Date date2 = new Date();
        String city2 = "Philadelphia";
        String state2 = "PA";
        String postCode2 = "19104";
        NewspaperArticle article2 = new NewspaperArticle(title2, author2, startPage2, endPage2, editors2, newspaper2, date2, city2, state2, postCode2);

        Client client = new Client();
        client.compare(article1, article2);
    }
}
