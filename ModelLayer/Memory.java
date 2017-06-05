package ModelLayer;

public class Memory extends Item
{
	private int mId;
	private String type, size;
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
	
	public void setType(String type)
	{
		this.type = type;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public String getType()
	{
		return type;
	}
	public String getSize()
	{
		return size;
	}
}