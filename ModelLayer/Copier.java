package ModelLayer;

public class Copier extends Item
{
	private String type, speed;
	
	public Copier(){}
	
	public Copier(String name, int price, int salePrice, int stock, String brand, String description, String type, String speed)
	{
		super(name, price, salePrice, stock, brand, description);
		this.type =type;
		this.speed =speed;
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