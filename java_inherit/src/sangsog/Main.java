package sangsog;

import common.Appliance;
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
		
		int a=10,b=20,c=30,d=40,e=50;
		// 서로 다른 이름을 가진 변수 여러개를 하나의 이름으로 묶어주기
		int[] arr= new int[5];
		int[] arr2=new int[6];
		int[] arr3=new int[7];
	    int[][] temp1 = new int[3][];
	    temp1[0]= arr;
	    temp1[1]= arr2;
	    // 같은 타입의 1차원 ㅐㅂ열 여러개 라면 2차원 배열 하나로 묶어주기
	    
	    int num=10;
	    String name="이순신";
	    int[] score = new int[10];
	    // 서로 다른 타입에 종류도 다르다면 클래스로 묶어주기
	    
	    class student{
	    	int num;
	    	String name;
	    	int[] score;
	    }
	    
	    // 클래스가 여러개 필요하다면
	    // 데이터를 중점으로 다루는 클래스가 있고 , 메서드를 중점으로 다루는 클래스가 있으니
	    // 데이터관련 클래스들 여러개는 공통점이 있는경우 부모 클래스로 묶어 준다.
	    // 메서드를 중점으로 다루느 클래스가 여러개라면 추상 부모 클래스 또는 인터페이스로 묶어준다.
	    
	    
       // Appliance app1 = new Appliance();        //추상클래스인 부모클래스는 객체 생성 불가
	    Appliance app1;
	    app1=air;
	    Appliance app2 = new Television();
	    Appliance app3 = new Refrigerator();
	    Appliance app4 = new Aircon();
	}

}
/*
 * 추상클래스 , 추상메서드
 * 추상클래스 만드는 이유 
 * 상속관계에서 공통적인 부분을 부모클래스에 두는데
 * 자식클래스들 마다 특징적인 동작을 위해 추상메서드가 만들어 두어야 한다.
 * 
 * 자식클래스들에게 규칙을 강제화 하기 위해
 * 
 * 설계도를 만들기 위해
 * 
 * 다형성을 안전하게 쓰기 위해
 * 
 *  추상 클래스를 사용하면 안되는 경우
 *  - 단순 규칙만 필요할때
 *  - 여러 클래스에 동시에 적용해야 할때
 *  -> 이런 경우는 인터페이스 사용
 *  
 *  인터페이스란 추상클래스의 일종이다.
 */

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