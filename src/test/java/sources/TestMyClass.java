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
        calculator.put(1, new Result(1));
        calculator.put(2, new Result(2));
        calculator.put(3, new Result(3));
        Result result1 = calculator.doCalculation(3);
        assertEquals(result1, calculator.get(3));
        Result result2 = calculator.doCalculation(4);
        assertEquals(result2, calculator.get(4));
        Result result3 = calculator.doCalculation(2);
        assertEquals(result3, calculator.get(2));
    }

    @Test
    public void doCalculation2() {
        MyClass calculator = new MyClass();
        calculator.put(1, new Result(1));
        calculator.put(2, new Result(2));
        calculator.put(3, new Result(3));
        calculator.put(4, new Result(4));
        calculator.put(5, new Result(5));
        calculator.put(6, new Result(6));
        Result result = calculator.doCalculation(1);
        assertEquals(result, calculator.get(1));
        assertEquals(calculator.doCalculation(2), calculator.get(2));
    }
}
