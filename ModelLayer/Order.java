package ModelLayer;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> orders = new ArrayList<OrderLine>();
	private int totalPrice = 0;

	public Order(){}

	public void addOrderLine(OrderLine orderLine) {
		orders.add(orderLine);
	}

	public int getTotalPrice()
	{
		int i;
		for(OrderLine o : orders)
		{
			i = o.getPrice();
			totalPrice += i;
		}
		return totalPrice;
	}
	
}
