package ModelLayer;

public class Memory extends Item
{
	private int mId;
	private int size;
	private String type;
	public Memory(String name, int price, int salePrice, int stock, String brand, String description, int mId, int size, String type)
	{
		super(name, price, salePrice, stock, brand, description);
		this.mId = mId;
		this.size = size;
		this.type = type;
	}

	public void setId(int id)
	{
		mId = id;
	}
	
	public int getId()
	{
		return mId;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}