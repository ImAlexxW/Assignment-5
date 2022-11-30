import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityStudentTest 
{

	private double[][] arr = {{1.0,2.0,3.0},{4.0,5.0,6.0,7.0},{8.0,9.0},{10.0},{11.0,12.0,13.0,14.0,15.0}};
	
	@BeforeEach
	void setUp() throws Exception {	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetTotal() 
	{
		assertEquals(120.0, TwoDimRaggedArrayUtility.getTotal(arr), .001);	
	}

	@Test
	void testGetAverage() 
	{
		assertEquals(8.0, TwoDimRaggedArrayUtility.getAverage(arr), .001);
	}

	@Test
	void testGetRowTotal() 
	{
		assertEquals(22.0, TwoDimRaggedArrayUtility.getRowTotal(arr, 1), .001);
	}

	@Test
	void testGetColumnTotal() 
	{
		assertEquals(22.0, TwoDimRaggedArrayUtility.getColumnTotal(arr, 2), .001);
	}

	@Test
	void testGetHighestInRow() 
	{
		assertEquals(15.0, TwoDimRaggedArrayUtility.getHighestInRow(arr, 4), .001);
	}

	@Test
	void testGetHighestInRowIndex() 
	{
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(arr, 1), .001);
	}

	@Test
	void testGetLowestInRow() 
	{
		assertEquals(8.0, TwoDimRaggedArrayUtility.getLowestInRow(arr, 2), .001);
	}

	@Test
	void testGetLowestInRowIndex() 
	{
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(arr, 0), .001);
	}

	@Test
	//
	//Needs to be fixed
	void testGetHighestInColumn() 
	{
		assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInColumn(arr, 0), .001);
	}

	@Test
	void testGetHighestInColumnIndex() 
	{
		assertEquals(4, TwoDimRaggedArrayUtility.getHighestInColumnIndex(arr, 0), .001);
	}

	@Test
	void testGetLowestInColumn() 
	{
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(arr, 0), .001);
	}

	@Test
	void testGetLowestInColumnIndex() 
	{
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(arr, 0), .001);
	}

	@Test
	void testGetHighestInArray() 
	{
		assertEquals(15.0, TwoDimRaggedArrayUtility.getHighestInArray(arr), .001);
	}

	@Test
	void testGetLowestInArray() 
	{
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(arr), .001);
	}

}