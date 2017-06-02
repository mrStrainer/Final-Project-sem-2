package ModelLayer;

public class Person {

	private String fName;
	private String lName;
	private String email;
	private String address;
	private int phone;
	private int bDay;

	public Person() {
	}

	public Person(String fName, String lName, String email, String address, int phone, int bDay) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.bDay = bDay;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setbDay(int bDay) {
		this.bDay = bDay;
	}

	public String getfName() {
		return fName;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getlName() {
		return lName;
	}

	public int getPhone() {
		return phone;
	}

	public int getbDay() {
		return bDay;
	}

}
