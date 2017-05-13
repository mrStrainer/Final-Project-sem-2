package ModelLayer;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> orders;
	private int totalPrice;
	private Person Person;

	public Order() {
		this.orders = new ArrayList<OrderLine>();
		this.totalPrice = 0;
	}
	public void addOrderLine (OrderLine orderLine) {
		orders.add(orderLine);
	}

	public ArrayList<OrderLine> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<OrderLine> orders) {
		this.orders = orders;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}
}
