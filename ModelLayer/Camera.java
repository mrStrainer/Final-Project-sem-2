package ModelLayer;

public class Camera extends Item
{
	private int camId;
	private String type, resolution;
	
	public Camera(){}
	
	public Camera(String name, int price, int salePrice, int stock, String brand, String description, int camId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.camId = camId;
	}
	
	public void setId(int id)
	{
		camId = id;
	}
	
	public int getId()
	{
		return camId;
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