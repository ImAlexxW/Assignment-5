public class HolidayBonus 
{
	
	private static final double HIGH_BONUS = 5000.0;
	private static final double LOW_BONUS = 1000.0;
	private static final double REGULAR_BONUS = 2000.0;
	
	
	
	//HolidayBonus methd
	public static double[] calculateHolidayBonus(double[][] data) 
	{
		
		double[] holidayBonuses = new double[data.length];
		
		for(int row = 0; row < data.length; row++) 
		{
			
			double total = 0;
			
			for(int col = 0; col < data[row].length; col++) 
			{
				
				if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col) == row)
					
					total += HIGH_BONUS;
				
				else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col) == row)
					
					total += LOW_BONUS;
				
				else
					
					total += REGULAR_BONUS;
				
			}
			
			holidayBonuses[row] = total;
			
		}
		
		return holidayBonuses;
		
	}
	
	//TotalHolidayBonus method
	public static double calculateTotalHolidayBonus(double[][] data) 
	{
		
		double holidayBonuses = 0;
		
		for(int row = 0; row < data.length; row++) 
		{
			
			for(int col = 0; col < data[row].length; col++) 
			{
				
				if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col) == row)
					
					holidayBonuses += HIGH_BONUS;
				
				else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col) == row)
					
					holidayBonuses += LOW_BONUS;
				
				else
					
					holidayBonuses += REGULAR_BONUS;
				
			}
			
		}
		
		return holidayBonuses;
		
	}

}