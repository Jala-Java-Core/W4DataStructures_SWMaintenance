package sources;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMyClass {
    @Before
    public void setup() {
    }

    @After
    public void cleanup() {
    }

    @Test
    public void doCalculation() {
        MyClass calculator = new MyClass();
        calculator.put(0, new Result());
        calculator.put(1, new Result());
        calculator.put(2, new Result());
        calculator.put(3, new Result());
        Result result = calculator.doCalculation(3);
        assertEquals(result, calculator.get(3));
    }

    @Test
    public void doCalculation2() {
        MyClass calculator = new MyClass();
        calculator.put(0, new Result());
        calculator.put(1, new Result());
        calculator.put(2, new Result());
        Result result = calculator.doCalculation(1);
        assertEquals(result, calculator.get(1));
    }
}
