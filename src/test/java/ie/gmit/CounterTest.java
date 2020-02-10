package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

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
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + testInfo.getDisplayName());
        myCounter = new Counter();
        System.out.println();
    }

    @Test
    @DisplayName("testConstructor - Checking Constructor is initialized")
    void testConstructor() {
        assertEquals(0, myCounter.getCount());
    }

    @Test
    @DisplayName("testConstructorWithValue - Checking Constructor with value")
    void testConstructorWithValue() {
        assertThrows(IllegalArgumentException.class, ()-> new Counter(-1));
        myCounter = new Counter(1);
    }

    @Test
    @DisplayName("testIncrement - Testing increment method")
    void testIncrement() {
        assertEquals(1, myCounter.increment());
    }

    @Test
    @DisplayName("testDecrement - Testing increment with a -1")
    void testDecrement() {
        assertEquals(-1, myCounter.decrement());
    }
}
