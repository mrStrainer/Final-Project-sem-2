package ModelLayer;


public class OrderLine {
	private static int orderLineCount = 0 ;
	private int orderLineId;
	private int price;
	private int amount;

	public OrderLine() {
	}

	public OrderLine(int price, int amount) {
		this.amount = amount;
		this.price = price;

		orderLineCount++;
		this.orderLineId = orderLineCount;
	}
	public OrderLine(int amount) {
		this.amount = amount;

		orderLineCount++;
		this.orderLineId = orderLineCount;
	}

	public int getId() {
		return orderLineId;
	}

	public void setId(int orderLineId) {
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



}
