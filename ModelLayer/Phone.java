package ModelLayer;

public class Phone extends Item
{
	private int phoneId;
	
	public Phone(String name, int price, int salePrice, int stock, String brand, String description, int phoneId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.phoneId = phoneId;
	}
	
	public void setId(int id)
	{
		phoneId = id;
	}
	
	public int getId()
	{
		return phoneId;
	}
}