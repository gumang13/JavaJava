package product;

import common.Appliance;

public class Aircon extends Appliance {
	
	public Aircon() {}
	public Aircon(String name,int powerCon) {
		super(name,powerCon);              // 부모 클래스의 생성자 메서드
		
	}
	@Override
	public void power() {
		onoff= !onoff;
		if(onoff) System.out.println("에어컨 전원이 켜졌습니다");
		else  System.out.println("에어컨 전원이 꺼졌습니다");
	}

}
