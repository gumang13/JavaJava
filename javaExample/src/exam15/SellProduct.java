package exam15;

public class SellProduct {
	  private String name;
	   private int price;
	   private int productCount;
	   
	   public void productCount() {
		   productCount++;
	   }
	   
	   
	   
	   

	   public SellProduct(String name, int price) {
		
		this.name = name;
		this.price = price;
		productCount();
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

	   public int getProductCount() {
		   return productCount;
	   }

	   public void setProductCount(int productCount) {
		   this.productCount = productCount;
	   }
	   
	   
}
