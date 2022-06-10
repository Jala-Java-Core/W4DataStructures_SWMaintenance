package logisitcs;

import banks.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEventLogistics {
    @BeforeEach
    public void setup() {
    }

    @After
    public void cleanup() {

    }

    @Test
    public void updateWithProfits() {
        EventLogistics eventLogistics = new EventLogistics();
        int[] siteProfits = {1, 2, 3, 4, 5};
        eventLogistics.updateWithProfits(siteProfits);
        assertEquals(eventLogistics.getMaxCapacity(), 11);
    }
}
