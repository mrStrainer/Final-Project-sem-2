package ModelLayer;

public class Item {
	private int price, salePrice, stock, id;
	private String name, brand, description;
	private static int count = 0;

	public Item() {
	}

	public Item(String name, int price, int salePrice, int stock, String brand, String description) {
		this.name = name;
		this.price = price;
		this.salePrice = salePrice;
		this.stock = stock;
		this.brand = brand;
		this.description = description;
		count++;
		this.id =count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSPrice(int sPrice) {
		salePrice = sPrice;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getSPrice() {
		return salePrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
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

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
