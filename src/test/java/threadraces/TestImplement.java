package threadraces;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestImplement {
    int NUM_THREADS = 1;

    @Before
    public void setUp() {

    }

    @After
    public void clean() {

    }
    //code W4-15
    @Test
    public void test() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        final Implement implement = new Implement();
        for (int i = 0; i < NUM_THREADS;  i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    implement.setBalance();
                    assertEquals(300, implement.myAccount.getBalance());
                }
            });
        }
    }
}
