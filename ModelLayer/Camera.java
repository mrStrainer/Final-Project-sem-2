package ModelLayer;

public class Camera extends Item
{
	private int camId;
	
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
}