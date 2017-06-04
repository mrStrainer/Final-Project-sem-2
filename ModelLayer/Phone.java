package ModelLayer;

public class Phone extends Item
{
	private int phoneId;
	private String ram;
	private String scrSize;
	
	public Phone(String name, int price, int salePrice, int stock, String brand, String description, int phoneId, String ram, String scrSize)
	{
		super(name, price, salePrice, stock, brand, description);
		this.phoneId = phoneId;
		this.ram = ram;
		this.scrSize = scrSize;
	}
	
	public void setId(int id)
	{
		phoneId = id;
	}
	
	public int getId()
	{
		return phoneId;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getScrSize() {
		return scrSize;
	}

	public void setScrSize(String scrSize) {
		this.scrSize = scrSize;
	}
}