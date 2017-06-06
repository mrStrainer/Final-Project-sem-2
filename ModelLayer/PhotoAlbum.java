package ModelLayer;

public class PhotoAlbum extends OrderLine {
	private int picAmount, price;
	private String size;
	private String pType;
	private String cType;

	public PhotoAlbum(int picAmount, int price, String size, String paperType, String coverType)
	{
		super(price,1);
		this.picAmount = picAmount;
		this.price = price;
		this.size = size;
		this.pType = paperType;
		this.cType = coverType;
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

}
