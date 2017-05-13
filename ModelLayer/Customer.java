package ModelLayer;

public class Customer extends Person {
	private int cId;

	public Customer(String fName, String lName, String email, String address, int id, int phone, int bDay, int cId) {
		super(fName, lName, email, address, id, phone, bDay);
		this.cId = cId;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}
}
