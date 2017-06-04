package ModelLayer;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> orders = new ArrayList<OrderLine>();
	private int totalPrice = 0;
	private Person person;

	public Order() {
	}

	public Order(Person person) {
		this.person = person;
	}

	public void addOrderLine(OrderLine orderLine) {
		orders.add(orderLine);
		this.totalPrice += orderLine.getPrice();
	}

}
