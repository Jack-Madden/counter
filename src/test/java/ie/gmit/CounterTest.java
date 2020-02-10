package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {

    private Counter myCounter;

    @BeforeEach
    void init() {
        myCounter = new Counter();
    }

    @Test
    void testConstructor() {
        assertEquals(0, myCounter.getCount());
    }
}
