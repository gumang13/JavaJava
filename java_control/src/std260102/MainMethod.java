package std260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
         //		주차장에 요금이 기본요금은 1000원이다.
         //		기본시간은 30분이다.
         //		10분 당 100원씩 추가  예) 39분은 1000원, 40분은 1100원
         //		단 4시간 이상 주차시 기본요금은 2500원이다.
         //		예) 3시간 50분 (230분) -> 3000원
         //		    4시간 12분 (252분) -> 2600원
         //		주차한 분 입력시 요금출력
		
		
		System.out.println("주차한 시간(분)을 입력하세요");
		Scanner kbd = new Scanner(System.in);
		int time = 0;
		int money = 0;
		time = kbd.nextInt();
		
		
		if(time>0) {                           
		if (time>=240) {                       
			money= 2500+((time-240)/10)*100;        
		}else if(time >=30){
			money= 1000+((time-30)/10)*100;         	
		}else {
			money= 1000;                       
		}
		}
		
            System.out.println("주차장 요금 : "+money);
           
	}

}
