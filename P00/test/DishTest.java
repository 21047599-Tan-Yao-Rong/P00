import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DishTest {

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
	public void testremoveDish1() {
		Dish[] dishArr = new Dish[10];
		Dish dish2 = new Dish ("Sushi",3);
		dishArr[2] = dish2;
		String dishToRemove = "Sushi";
			
		dishArr[2].removeDish(dishToRemove);
		
		assertFalse(dishArr[2].isAvailable);
	}
	
	@Test
	public void testremoveDish2() {
		fail("Invaild Option!, Null objects cannot be removed");
		Dish[] dishArr = new Dish[10];
		Dish dish9 = new Dish (null, 0);
		dishArr[9] = dish9;
		String dishToRemove = null;
		dishArr[9].removeDish(dishToRemove);
	}
	
	@Test
	public void testremoveDish3() {
		Dish[] dishArr = new Dish[10];
		dishArr[0] = new Dish ("A", 1);
		dishArr[1] = new Dish ("B", 2);
		dishArr[2] = new Dish ("C", 3);
		dishArr[3] = new Dish ("D", 4);
		dishArr[4] = new Dish ("E", 5);
		dishArr[5] = new Dish ("F", 6);
		dishArr[6] = new Dish ("G", 7);
		dishArr[7] = new Dish ("H", 8);
		dishArr[8] = new Dish ("I", 9);
		dishArr[9] = new Dish ("J", 10);
		int HowManyIsRemoved = 0;
		int Expected = 7;
		
		for(int i =0; i < dishArr.length; i++) {
			if (HowManyIsRemoved < 7) {
				dishArr[i].removeDish(dishArr[i].dishName);
				HowManyIsRemoved += 1;
			}
		}
		
		assertEquals("Test that 7 dishes are unavailable",Expected, HowManyIsRemoved);
		
	}
	


	



}
