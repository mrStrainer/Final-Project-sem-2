package ModelLayer;

import java.util.ArrayList;

public class Order {
	private static int orderCount = 0;
	private ArrayList<OrderLine> orders = new ArrayList<OrderLine>();
	private int totalPrice = 0;
	private int orderId;

	public Order(){
		orderCount++;
		this.orderId = orderCount;
	}

	public void addOrderLine(OrderLine orderLine) {
		orders.add(orderLine);
		totalPrice +=orderLine.getPrice();
	}
	public void removeOrderLine(OrderLine orderLine) {
		orders.remove(orderLine);
		totalPrice -= orderLine.getPrice();
	}

	public int getTotalPrice()
	{
		return totalPrice;
	}

	public ArrayList<OrderLine> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<OrderLine> orders) {
		this.orders = orders;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getId() {
		return orderId;
	}

	public void setId(int orderId) {
		this.orderId = orderId;
	}
}
