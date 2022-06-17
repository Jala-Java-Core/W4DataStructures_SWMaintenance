package sources;

import banks.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDataProcessor {

    @Before
    public void setup() {
    }

    @After
    public void cleanup() {
    }

    @Test
    public void testMyMethod() {
        DataProcessor dataProcessor = new DataProcessor();
        String result = dataProcessor.myMethod("select * from sources");
        assertEquals("0", result);
    }
}
