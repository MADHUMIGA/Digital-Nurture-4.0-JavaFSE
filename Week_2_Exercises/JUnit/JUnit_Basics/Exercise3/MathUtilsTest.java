package in.madhu.junit_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class MathUtilsTest {

	  MathUtils math = new MathUtils();

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
