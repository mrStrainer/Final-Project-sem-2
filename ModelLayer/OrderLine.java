package ModelLayer;

import java.util.ArrayList;

public class OrderLine {
	private static int orderLineCount = 0 ;
	private int orderLineId;
	private int price;
	private int amount;
	private boolean isService;
	private Service service;
	private Item item;

	public OrderLine() {
	}

	public OrderLine(Item item, int price, int amount, boolean isService) {
		this.item = item;
		this.price = price;
		this.amount = amount;
		this.isService = isService;
		orderLineCount++;
		this.orderLineId = orderLineCount;
	}

	public int getId() {
		return orderLineId;
	}

	public void setId(int orderLineId) {
		this.orderLineId = orderLineId;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isService() {
		return isService;
	}

	public void setService(boolean isService) {
		this.isService = isService;
	}


}
