package ModelLayer;

public class Employee extends Person {

	private int eId;

	public Employee(String fName,String lName,String email,String address,int phone,int bDay,int eId) {
		super(fName, lName, email, address, phone, bDay);
		this.eId = eId;
	}

	public Employee() {}
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

}
