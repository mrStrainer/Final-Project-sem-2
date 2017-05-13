package ModelLayer;

public class Print extends Service {

	private int amount, size;
	private String type;

	public Print(int sId, int price, String description, boolean status, int amount, int size, String type) {
		super(sId, price, description, status);
		this.amount = amount;
		this.size = size;
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
