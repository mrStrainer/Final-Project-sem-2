package ModelLayer;


public class OrderLine {
	private static int orderLineCount = 0 ;
	private int orderLineId;
	private int price;
	private int amount;
	private int type;

	public OrderLine() {
	}

	public OrderLine(int price, int amount, int type) {
		this.amount = amount;
		this.price = price;
		this.type = type;
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


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
