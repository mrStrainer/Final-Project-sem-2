package ModelLayer;

import ModelLayer.*;

public class Minus10PercentStrategy
{
	private double i
	public double getTotal(OrderLine ol, int threshold)
	{
		i=((ol.getPrice()*threshold)/100);
		return i;
	}
}
