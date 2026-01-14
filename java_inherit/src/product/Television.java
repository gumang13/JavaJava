package product;

import common.Appliance;

public class Television extends Appliance{       
	
	@Override
	public void power() {
		onoff =!onoff;
		if(onoff)
			System.out.println("tv 전원이 켜짐");
		else
			System.out.println("tv 전원이 꺼짐");
		
	}
	
 









}
