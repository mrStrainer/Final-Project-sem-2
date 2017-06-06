package ModelLayer;

public class Service extends OrderLine{
	private String description;
	private boolean status;
	private String location;
	private String startDate;

	public Service(int price, String description, boolean status, String location, String startDate) {
		super(price,1);
		this.description = description;
		this.status = status;
		this.location = location;
		this.startDate = startDate;
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

}
