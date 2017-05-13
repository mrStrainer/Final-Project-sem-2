package ModelLayer;

public class Album extends Item{

	private int size;
	private String type, crust;

	public Album(int pId, int price, int salePrice, int stock, String name, String brand, String description, int size, String type, String crust) {
		super(pId, price, salePrice, stock, name, brand, description);
		this.size = size;
		this.type = type;
		this.crust = crust;
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

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}
}
