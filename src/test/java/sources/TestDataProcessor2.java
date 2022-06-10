package sources;

import banks.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDataProcessor2 {

    @Before
    public void setup() {
    }

    @After
    public void cleanup() {
    }

    @Test
    public void testMyMethod() {
        DataProcessor2 dataProcessor = new DataProcessor2();
        String result = dataProcessor.myMethod("select * from sources");
        assertEquals("", result);
    }
}
