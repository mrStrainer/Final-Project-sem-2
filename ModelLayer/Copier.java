package ModelLayer;

public class Copier extends Item
{
	private int copyId;
	private String type, speed;
	
	public Copier(){}
	
	public Copier(String name, int price, int salePrice, int stock, String brand, String description, int copyId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.copyId = super.getID();
	}
	
	public void setId(int id)
	{
		copyId = id;
	}
	
	public int getId()
	{
		return copyId;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	public void setSpeed(String speed)
	{
		this.speed = speed;
	}
	
	public String getType()
	{
		return type;
	}
	public String getSpeed()
	{
		return speed;
	}
}