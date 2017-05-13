package ModelLayer;

public class Person {

	private String fName;
	private String lName;
	private String email;
	private String address;
	private int id;
	private int phone;
	private int bDay;

	public Person(String fName, String lName, String email, String address, int id, int phone, int bDay) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
		this.id = id;
		this.phone = phone;
		this.bDay = bDay;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getbDay() {
		return bDay;
	}

	public void setbDay(int bDay) {
		this.bDay = bDay;
	}
}
