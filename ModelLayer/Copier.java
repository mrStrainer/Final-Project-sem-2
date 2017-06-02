package ModelLayer;

public class Copier extends Item
{
	private int copyId;
	
	public Copier(String name, int price, int salePrice, int stock, String brand, String description, int copyId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.copyId = copyId;
	}
	
	public void setId(int id)
	{
		copyId = id;
	}
	
	public int getId()
	{
		return copyId;
	}
}