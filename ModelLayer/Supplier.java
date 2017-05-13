package ModelLayer;

public class Supplier extends Person {

	private int sId;

	public Supplier(String fName, String lName, String email, String address, int id, int phone, int bDay, int sId) {
		super(fName, lName, email, address, id, phone, bDay);
		this.sId = sId;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}
}
