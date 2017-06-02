package ModelLayer;

public class Other extends Item
{
	private int oId;
	
	public Other(String name, int price, int salePrice, int stock, String brand, String description, int oId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.oId = oId;
	}
	
	public void setId(int id)
	{
		oId = id;
	}
	
	public int getId()
	{
		return oId;
	}
}