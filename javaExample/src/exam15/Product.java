package exam15;

public class Product {
   private String name;
   private int price;
   private int productCount;
   
   public void sellProduct(String name) {
	   productCount++;
   }
   
   public void productCount() {
	   productCount++;
   }
   public Product(String name, int price) {
	super();
	this.name = name;
	this.price = price;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getPrice() {
	return price;
   }
   public void setPrice(int price) {
	this.price = price;
   }
   
}
