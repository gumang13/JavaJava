package std20260112;

public class Method2 {

	public static void main(String[] args) {
		
           Vending vend1 = new Vending("콜라",1200,2);
           Vending vend2 = new Vending("사이다",1000,3);
           
           System.out.println(vend1);
           vend1.buy(1500);
           vend1.buy(1500);
           System.out.println(vend1);
           vend2.buy(1000);
           System.out.println(vend2);
           vend1.buy(1000);
           System.out.println(vend1);
           vend1.productStock();
           vend1.addProduct(5);
           System.out.println(vend1);
           
	}

}
