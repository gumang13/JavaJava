package std20260113;

public class Product {
	
	private String itemName;        // 제품이름
	private int price;              // 제품가격
	private int stock;              // 상품수량
	private String description;     // 제품설명
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [itemName=" + itemName + ", price=" + price + ", stock=" + stock + ", description="
				+ description + "]";
	}
	public Product(String itemName, int price, int stock, String description) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.stock = stock;
		this.description = description;
	}

	
	
}
