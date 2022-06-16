package sources;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDataProcessorV2 {

    @Before
    public void setup() {
    }

    @After
    public void cleanup() {
    }

    @Test
    public void testMyMethod() {
        DataProcessorV2 dataProcessor = new DataProcessorV2();
        String result = dataProcessor.myMethod("select * from sources");
        assertEquals("", result);
    }
}
