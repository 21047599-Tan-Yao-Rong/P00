import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Quiztest {

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
	public final void findMaxTest1() {
		int[] arrA = {1,3,2,4};
		assertEquals("test if the biggest integer is 4",4, HelloWorld.findMax(arrA));
		
	}
	
	@Test
	public final void findMAxTest2() {
		
		int[] arrB = {-11,-3,-1,-2,-4};
		assertEquals("test if the biggest integer is -1",-1, HelloWorld.findMax(arrB));
		
	}
	
	

}
