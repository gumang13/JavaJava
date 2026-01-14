package sangsog;

import product.Aircon;
import product.Refrigerator;
import product.Television;

public class Main {

	public static void main(String[] args) {
		
		Television tv = new Television();
		Refrigerator rg = new Refrigerator();
		Aircon air = new Aircon("LG휘센",240);
		
		tv.power();
		tv.power();
        air.power();      		
		
		System.out.println(air);

	}

}

// 자바의 상속
// 오버라이딩
// 다형성
// 추상화
// protected
// final
// instanceof

// 상속공부 하기 위해 사용할만한 주제
//  동물에 대한 상속 
// 직원 급여 계산 시스템 -  지원 부모 -
// 결제 시스템  결제 부모 , 카드 결제 , 현금 , 이체 는 자식
// 게임 케릭터 케릭터 부모 직업이 자식
// 교통 수단 시스템 , 교통수단 부모 버스 기차 차 오토바이 자전거 자식