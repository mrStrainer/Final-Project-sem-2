package ModelLayer;

public class PhotoAlbum 
{
	private static int phCount = 0;
	private int picAmount, price;
	private String size;
	private String pType;
	private String cType;
	private int phId;
	
	public PhotoAlbum(){}
	
	public PhotoAlbum(int picAmount, int price, String size, String paperType, String coverType)
	{
		this.picAmount = picAmount;
		this.price = price;
		this.size = size;
		this.pType = paperType;
		this.cType = coverType;
		phCount++;
		this.phId = phCount;
	}
	
	public void setPicAmount(int picAmount)
	{
		this.picAmount = picAmount;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPicAmount()
	{
		return picAmount;
	}
	public int getPrice()
	{
		return price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public int getId() {
		return phId;
	}

	public void setId(int phId) {
		this.phId = phId;
	}
}
