package ModelLayer;

public class Camera extends Item
{
	private int camId;
	private String type;
	private String resolution;
	
	public Camera(String name, int price, int salePrice, int stock, String brand, String description, int camId, String type, String resolution)
	{
		super(name, price, salePrice, stock, brand, description);
		this.camId = camId;
		this.type = type;
		this.resolution = resolution;
	}
	
	public void setId(int id)
	{
		camId = id;
	}
	
	public int getId()
	{
		return camId;
	}

	public int getCamId() {
		return camId;
	}

	public void setCamId(int camId) {
		this.camId = camId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
}