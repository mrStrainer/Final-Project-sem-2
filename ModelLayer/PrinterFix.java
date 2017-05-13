package ModelLayer;

public class PrinterFix extends Service {

	private int startDate, duration;
	private String location;

	public PrinterFix(int sId, int price, String description, boolean status, int startDate, int duration, String location) {
		super(sId, price, description, status);
		this.startDate = startDate;
		this.duration = duration;
		this.location = location;
	}

	public int getStartDate() {
		return startDate;
	}

	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
