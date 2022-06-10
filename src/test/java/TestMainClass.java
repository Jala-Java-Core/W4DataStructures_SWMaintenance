import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainClass {

    @Before
    public void setup() {
    }

    @After
    public void cleanup() {
    }

    @Test
    public void testArrayMax() {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] result = MainClass.arrayMax(array1, array2);
        assertEquals(result, array2);
    }

    @Test
    public void testArrayMax2() {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] result = MainClass.arrayMax2(array1, array2);
        assertEquals(result, array2);
    }

    @Test
    public void testElementsInCommon() {
        List list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List list2 = new ArrayList<Integer>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        int result = MainClass.elementsInCommon(list1, list2);
        assertEquals(result, 3);
    }

    @Test
    public void testMyMethod() {
        int result = MainClass.myMethod(1);
        assertEquals(3, result);
    }
}
