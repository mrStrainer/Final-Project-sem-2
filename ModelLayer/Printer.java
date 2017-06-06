package ModelLayer;

public class Printer extends Item
{
	private String type, size;
	
	public Printer(){}
	
	public Printer(String name, int price, int salePrice, int stock, String brand, String description, String type, String size)
	{
		super(name, price, salePrice, stock, brand, description);
		this.type = type;
		this.size = size;
	}

	
	public void setType(String type)
	{
		this.type = type;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public String getType()
	{
		return type;
	}
	public String getSize()
	{
		return size;
	}
}
