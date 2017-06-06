package ModelLayer;

import ModelLayer.Order;

public class ThresholdStrategy 
{
	private int threshold = 1500;
	
	public double getTotal(Order order)
	{
		double a = order.getTotalPrice();
		if (a > threshold)
		{
			a=(a*0.95);
		}
		return a;
	}
}
