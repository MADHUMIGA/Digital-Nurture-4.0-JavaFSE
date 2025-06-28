package in.madhu.junit_practice;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathUtilsTest {

	private MathUtils math;
	
	  @BeforeEach
	    void setUp() {
	       
		   math = new MathUtils();
	        System.out.println("Before each test");
	    }

	    @AfterEach
	    void tearDown() {
	        
	        System.out.println("After each test");
	    }


	    @Test
	    void testAdd() {
	        assertEquals(10, math.add(7, 3), "Addition should return 10");
	    }

	    @Test
	    void testDivide() {
	        assertEquals(2, math.divide(10, 5), "Division should return 2");
	    }

	    @Test
	    void testIsEvenTrue() {
	        assertTrue(math.isEven(4), "4 is an even number");
	    }

	    @Test
	    void testIsEvenFalse() {
	        assertFalse(math.isEven(5), "5 is not an even number");
	    }

	    @Test
	    void testMessageNotNull() {
	        assertNotNull(math.getWelcomeMessage(), "Message should not be null");
	    }

	    @Test
	    void testDivideByZeroThrowsException() {
	        assertThrows(ArithmeticException.class, () -> math.divide(5, 0), "Should throw ArithmeticException");
	    }
}
