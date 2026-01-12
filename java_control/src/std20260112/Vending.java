package std20260112;

public class Vending {
       // 자판기 클래스
	
	   private String productName;   // 음료수 이름
	   private int price;            // 음료수 가격
	   private int stock;            // 음료수 수량
	   public Vending(String productName, int price, int stock) {
		   super();
		   this.productName = productName;
		   this.price = price;
		   this.stock = stock;
	   }
	   public Vending() {
		  
	   }
	   public String getProductName() {
		   return productName;
	   }
	   public void setProductName(String productName) {
		   this.productName = productName;
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
	   @Override
	   public String toString() {
		return "자판기 [상품명 = " + productName + ", 가격 = " + price + ", 잔여수량 = " + stock + " ]";
	   }
	   
	   //toString과 매개변수 있는 생성자 메서드 
	   // 각 변수들의 set ,get 메서드 만들기
	   
	   // 문제 
	   //  음료를 구매하기 위해 돈을 넣었다. 
	   //  내가 넣은 돈으로 구매가 가능하면 
	   // 수량을 1 감소시켜라 
	   
	   public void buy(int coin) {
		   if(coin>=this.price)
			   this.stock--;
	   }
	   
	   // 문제 
	   //  음료를 자판기에서 구매하는데
	   //  수량이 충분한지 품절인지
	   //  확인할수 있는 메서드 만들기
	   //  품절이면 "품절입니다" 출력
	   //  수량이 있으면 수량 출력
	   public void productStock() {
		   if(this.stock>=1)
			   System.out.println("잔여수량 : "+this.stock+" 개 ");
	   else 
           System.out.println("품절입니다");
	   }

    // 문제
	// 음료수의 수량이 부족하여 자판기 관리자가 채우려고 한다.
	// 해당 음료수의 수량을 채우기 위해 얼만큼 넣었는지 
	// 그리고 해당 음료수의 수량을 증가시켜라
	   
	  public void addProduct(int add) {
		  System.out.println(productName+" 수량이"+add+"개 증가했습니다.");
		  this.stock+=add;
		  
	  }
	   
	   
	   
	   
}

