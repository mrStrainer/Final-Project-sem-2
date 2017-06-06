package ModelLayer;

public class Service {
	private static int serviceCount = 0;
	private int price;
	private String description;
	private boolean status;
	private int serviceId;

	public Service() {
	}

	public Service(int sId, int price, String description, boolean status) {
		this.price = price;
		this.description = description;
		this.status = status;
		serviceCount++;
		this.serviceId=serviceCount;
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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getId() {
		return serviceId;
	}

	public void setId(int serviceId) {
		this.serviceId = serviceId;
	}
}
