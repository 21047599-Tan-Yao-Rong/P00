import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);

	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		
		int a = 2222;
		int b = 1111;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 1111;
		assertEquals (expected, actual);

	}
	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		
		int a = 1000;
		int b = 3;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 3000;
		assertEquals (expected, actual);

		
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		
		int a = 9999;
		int b = 3;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 3333;
		assertEquals (expected, actual);

		
	}

}
