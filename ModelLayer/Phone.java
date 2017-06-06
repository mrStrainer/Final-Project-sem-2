package ModelLayer;

public class Phone extends Item
{
	private String scSize, RAM;
	
	public Phone(){}
	
	public Phone(String name, int price, int salePrice, int stock, String brand, String description, String scSize, String RAM)
	{
		super(name, price, salePrice, stock, brand, description);
		this.scSize=scSize;
		this.RAM=RAM;
	}

	public void setScSize(String scSize)
	{
		this.scSize=scSize;
	}
	public void setRAM(String RAM)
	{
		this.RAM=RAM;
	}

	public String getScSize()
	{
		return scSize;
	}
	public String getRAM()
	{
		return RAM;
	}
}