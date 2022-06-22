package threadraces;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCounter {
    private final static int NUM_THREADS = 10;
    private final static int NUM_ITERATIONS = 1000;

    @Before
    public void setUp() {

    }

    @After
    public void after() {

    }
    //Code W4-14
    @Test
    public void test() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        final Counter sync = new Counter();
        final Counter2 notSync = new Counter2();
        for (int i = 0; i < NUM_THREADS; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < NUM_ITERATIONS; j++) {
                        //sync.incrementCount1();
                        notSync.incrementCount1();
                    }
                }
            });
        }
    }
}
