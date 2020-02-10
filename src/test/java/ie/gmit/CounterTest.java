package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {

    private Counter myCounter;

    @BeforeAll
    static void startTest() {
        System.out.println("Starting tests");
    }

    @AfterAll
    static void finishTest() {
        System.out.println("Finished tests");
    }

    @BeforeEach
    void init() {
        myCounter = new Counter();
    }

    @Test
    void testConstructor() {
        assertEquals(0, myCounter.getCount());
    }

    @Test
    void testConstructorWithValue() {
        assertThrows(IllegalArgumentException.class, ()-> new Counter(-1));
        myCounter = new Counter(1);
    }

    @Test
    void testIncrement() {
        assertEquals(1, myCounter.increment());
    }

    @Test
    void testDecrement() {
        assertEquals(-1, myCounter.decrement());
    }
}
