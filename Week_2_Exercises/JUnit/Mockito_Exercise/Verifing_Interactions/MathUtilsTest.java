package in.madhu.junit_practice;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;


public class MathUtilsTest {
	@Test
    void testAddMethodCalledWithCorrectArgs() {
        MathUtils mock = mock(MathUtils.class);  
        mock.add(2, 3);                            
        verify(mock).add(2, 3);                   
    }
}
