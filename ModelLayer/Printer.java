package ModelLayer;

public class Printer extends Item
{
	private int printId;
	private String type;
	private  String size;
	
	public Printer(String name, int price, int salePrice, int stock, String brand, String description, int printId, String type, String size)
	{
		super(name, price, salePrice, stock, brand, description);
		this.printId = printId;
		this.type = type ;
		this.size = size;
	}
	
	public void setId(int id)
	{
		printId = id;
	}
	
	public int getId()
	{
		return printId;
	}

	public int getPrintId() {
		return printId;
	}

	public void setPrintId(int printId) {
		this.printId = printId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
