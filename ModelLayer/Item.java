package ModelLayer;

public class Item {
	private int pId, price, salePrice, stock;
	private String name, brand, description;

	public Item(){}

	public Item(int pId, int price, int salePrice, int stock, String name, String brand, String description) {
		this.pId = pId;
		this.price = price;
		this.salePrice = salePrice;
		this.stock = stock;
		this.name = name;
		this.brand = brand;
		this.description = description;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
