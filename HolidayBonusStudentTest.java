

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusStudentTest 
{
	
	private double[][] arr = { { 3, 13, 9 }, { 2, 5 }, { 6, 4, 10 } };

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculateHolidayBonus()
	{
		try 
		{
			double[] result = HolidayBonus.calculateHolidayBonus(arr);
			assertEquals(8000.0, result[0], .001);
			assertEquals(3000.0, result[1], .001);
			assertEquals(11000.0, result[2], .001);
		} 
		catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}

	@Test
	void testCalculateTotalHolidayBonus() 
	{
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(arr), .001);
	}

}