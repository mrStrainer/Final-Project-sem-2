package ModelLayer;

public class Phone extends Item
{
	private int phoneId;
	private String scSize, RAM;
	
	public Phone(){}
	
	public Phone(String name, int price, int salePrice, int stock, String brand, String description, String scSize, String RAM)
	{
		super(name, price, salePrice, stock, brand, description);
		this.scSize=scSize;
		this.RAM=RAM;
	}
	
	public void setId(int id)
	{
		phoneId = id;
	}
	public void setScSize(String scSize)
	{
		this.scSize=scSize;
	}
	public void setRAM(String RAM)
	{
		this.RAM=RAM;
	}
	
	public int getId()
	{
		return phoneId;
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