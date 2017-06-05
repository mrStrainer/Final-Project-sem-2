package ModelLayer;

public class Printer extends Item
{
	private int printId;
	private String type, size;
	
	public Printer(){}
	
	public Printer(String name, int price, int salePrice, int stock, String brand, String description, int printId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.printId = printId;
	}
	
	public void setId(int id)
	{
		printId = id;
	}
	
	public int getId()
	{
		return printId;
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
