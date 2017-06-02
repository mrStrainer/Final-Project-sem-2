package ModelLayer;

public class PhotoAlbum 
{
	private int picAmount, price;
	private String size;
	private String pType;
	private String cType;
	
	public PhotoAlbum(){}
	
	public PhotoAlbum(int picAmount, int price, String size, String paperType, String coverType)
	{
		this.picAmount = picAmount;
		this.price = price;
		this.size = size;
		pType = paperType;
		cType = coverType;
	}
	
	public void setPicAmount(int picAmount)
	{
		this.picAmount = picAmount;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setSize(String size)
	{
		this.size = size;//*can be only Small, Medium or Large
	}
	public void setPType(String pType)
	{
		this.pType = pType;
	}
	public void setCType(String cType)
	{
		this.cType = cType;
	}
	
	public int getPicAmount()
	{
		return picAmount;
	}
	public int getPrice()
	{
		return price;
	}
	public String getSize()
	{
		return size;
	}
	public String getPType()
	{
		return pType;
	}
	public String getCType()
	{
		return cType;
	}
	
}
