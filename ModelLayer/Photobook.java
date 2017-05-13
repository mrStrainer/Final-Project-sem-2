package ModelLayer;

public class Photobook extends Service {

	private int size, amount;
	private String type;

	public Photobook(int sId, int price, String description, boolean status, int size, int amount, String type) {
		super(sId, price, description, status);
		this.size = size;
		this.amount = amount;
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
