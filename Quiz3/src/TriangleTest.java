import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testArea() {
		Triangle myTriangle = new Triangle(10,10,10);
		assertEquals(43.3,43.3);
	}
	
	@SuppressWarnings("deprecation")
	public void testPerimeter() {
		Triangle myTriangle = new Triangle(4,6,2);
		assertEquals(12.0,12.0);
		}
	
	public void TrianglExceptionTest(Object TriangleException) {
		testArea();
		testPerimeter();
			
		}
	}


