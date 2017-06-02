package ModelLayer;

public class Customer extends Person {
	private int cId;

	public Customer(String fName,String lName,String email,String address,int phone,int bDay,int cId) {
		super(fName, lName, email, address, phone, bDay);
		this.cId = cId;
	}

	public Customer() {}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

}
