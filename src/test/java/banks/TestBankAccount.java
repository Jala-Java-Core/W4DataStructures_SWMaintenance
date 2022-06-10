package banks;

import banks.exceptions.NegativeBalanceException;
import banks.exceptions.NullArgumentException;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestBankAccount {

    private BankAccount alice;
    private BankAccount bob;

    @BeforeEach
    public void setup() {
        this.alice = new BankAccount(10);
        this.bob = new BankAccount(10);
    }

    @After
    public void cleanup() {

    }

    @Test
    public void testTransfer() {
        this.alice.transfer(this.bob, 5);
        assertEquals(15, this.alice.getBalance());
        assertEquals(5, this.bob.getBalance());
    }

    @Test
    void testTransfer2() {
        int result = this.alice.transfer2(null, 5);
        assertEquals(-1, result);
    }

    @Test
    void testTransfer2_balance() {
        int result = this.alice.transfer2(this.bob, 50);
        assertEquals(0, result);
    }

    @Test
    void testTransfer3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.alice.transfer3(null, 50);
        });
        Assertions.assertThrows(IllegalStateException.class, () -> {
            this.alice = new BankAccount(-1);
            this.alice.transfer3(bob, 50);
        });
    }

    @Test
    void testTransfer4() {
        Assertions.assertThrows(NullArgumentException.class, () -> {
            this.alice.transfer4(null, 50);
        });
        Assertions.assertThrows(NegativeBalanceException.class, () -> {
            this.alice = new BankAccount(-1);
            this.alice.transfer4(bob, 50);
        });
    }
}
