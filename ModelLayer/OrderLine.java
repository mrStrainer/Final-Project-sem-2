package ModelLayer;


public class OrderLine {

	private int orderLineId;
	private int price;
	private int amount;
	private boolean isService;
	private Service service;
	private Item item;

	public OrderLine() {
	}

	public OrderLine(int orderLineId, Item item, int price, int amount) {
		this.orderLineId = orderLineId;
		this.price = price;
		this.amount = amount;
		this.isService = false;
		this.item = item;
		this.price = price*amount;
	}
	public OrderLine(int orderLineId, Service service, int price) {
		this.orderLineId = orderLineId;
		this.price = price;
		this.amount = 1;
		this.isService = true;
		this.service = service;
		this.price = price;
	}

	public int getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(int orderLineId) {
		this.orderLineId = orderLineId;
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
