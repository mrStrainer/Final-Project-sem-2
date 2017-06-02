package ModelLayer;

public class Memory extends Item
{
	private int mId;
	
	public Memory(String name, int price, int salePrice, int stock, String brand, String description, int mId)
	{
		super(name, price, salePrice, stock, brand, description);
		this.mId = mId;
	}
	
	public void setId(int id)
	{
		mId = id;
	}
	
	public int getId()
	{
		return mId;
	}
}