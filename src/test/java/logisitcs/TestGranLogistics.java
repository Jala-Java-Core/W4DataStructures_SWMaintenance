package logisitcs;
import banks.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGranLogistics {
    @BeforeEach
    public void setup() {
    }

    @After
    public void cleanup() {

    }

    @Test
    public void fullfillAllRequestsFalse() {
        GrantLogistics grantLogistics = new GrantLogistics(10);
        int[] individualRequests = {1, 2, 3, 4, 5};
        boolean result = grantLogistics.fullfillAllRequests(individualRequests);
        assert(result == false);
    }

    @Test
    public void fullfillAllRequestsTrue() {
        GrantLogistics grantLogistics = new GrantLogistics(10);
        int[] individualRequests = {1, 2, 3};
        boolean result = grantLogistics.fullfillAllRequests(individualRequests);
        assert(result);
    }
}
