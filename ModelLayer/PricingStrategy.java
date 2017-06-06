package ModelLayer;

/**
 * Created by atee on 2017.06.06..
 */
public static class PricingStrategy 
{
	public void addMinusPercent()
	{
		MinusPercentStrategy.getTotal();
	}
	
	public void addThreshold()
	{
		ThresholdStrategy.getTotal();
	}
}
