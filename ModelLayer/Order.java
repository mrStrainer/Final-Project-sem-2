package ModelLayer;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> orders;
	private int totalPrice;
	private Person Person;

	public Order() {
	}

	public Order(ArrayList<OrderLine> orders, int totalPrice, Person Person) {
		// this.totalPrice =
		orders = new ArrayList<OrderLine>();
		// TODO Person stuff
	}

}
