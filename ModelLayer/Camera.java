package ModelLayer;

public class Camera extends Item
{
	private String type, resolution;
	
	public Camera(){}
	
	public Camera(String name, int price, int salePrice, int stock, String brand, String description, String type, String resolution)
	{
		super(name, price, salePrice, stock, brand, description);
		this.type = type;
		this.resolution = resolution;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	public void setResolution(String resolution)
	{
		this.resolution=resolution;
	}
	
	public String getType()
	{
		return type;
	}
	public String getResolution()
	{
		return resolution;
	}
}