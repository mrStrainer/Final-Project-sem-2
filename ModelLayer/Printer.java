package ModelLayer;

public class Printer extends Item
{
	private int printId;
	
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
}
