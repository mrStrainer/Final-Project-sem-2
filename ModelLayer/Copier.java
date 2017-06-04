package ModelLayer;

public class Copier extends Item
{
	private int copyId;
	private String type;
	private  String speed;

	public Copier(String name, int price, int salePrice, int stock, String brand, String description, int copyId, String type, String speed)
	{
		super(name, price, salePrice, stock, brand, description);
		this.copyId = copyId;
		this.type = type;
		this.speed = speed;
	}
	
	public void setId(int id)
	{
		copyId = id;
	}
	
	public int getId()
	{
		return copyId;
	}

	public int getCopyId() {
		return copyId;
	}

	public void setCopyId(int copyId) {
		this.copyId = copyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
}