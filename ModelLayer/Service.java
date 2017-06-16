package ModelLayer;

public class Service extends OrderLine{
	private String description;
	private boolean status;
	private String location;
	private String startDate;

	public Service(){}
	
	public Service(int price, String description, boolean status, String location, String startDate) {
		super(price,1,1);
		this.description = description;
		this.status = status;
		this.location = location;
		this.startDate = startDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean getStatus() {
		return status;
	}

	public String getLocation() {
		return location;
	}

	public String getStartDate() {
		return startDate;
	}
}
