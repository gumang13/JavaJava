package product;

import common.Appliance;

public class Refrigerator extends Appliance{
	
	public Refrigerator() {
		power();
	}
	   @Override
      public void power() {
    	 
    	  System.out.println("냉장고 전원이 켜졌습니다");
      }
}
