package ModelLayer;

public class Service {

	private int sId;
	private int price;
	private String description;
	private boolean status;

	public Service(int sId, int price, String description, boolean status) {
		this.sId = sId;
		this.price = price;
		this.description = description;
		this.status = status;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
