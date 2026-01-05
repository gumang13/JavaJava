package std260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		
		
//        if(10>5) {
//        	System.out.println(" 5보다 크다");
//        }else{
//        	System.out.println(" 5보다 작다");
//        }
//        
//        // 바이킹 탑승 가능 : 145cm 이상
//	int tall = 160;
//	if(tall>=145) {
//		System.out.println("탑승 가능합니다");
//	}else {
//		System.out.println("탑승 불가능합니다");
//	}
//	
//	int age = 33; 
//	
//	if(age>=30 && age<40) {
//		System.out.println("30대 입니다");
//	}else {
//		System.out.println("30대가 아닙니다");
//	}
//	
//	
	// 주차장에 요금이 기본요금은 1000원 이다.
	// 기본 시간은 30분 이다 
	// 10분당  100원씩 추가 ex) 39분 1000 , 40분 1100
	// 주차한 분을 입력하면 요금이 얼마나 나올지 
	// 단 4시간 이상 주차시 기본 요금 2500
	// 예) 3시간 50분 (230분) - 3000 원
	// 4시간 12분 (252분) - 2600원
	
	
	System.out.println("주차 시간을 입력하세요");
	Scanner kbd = new Scanner(System.in);
	int time = 0;
	int money = 1000;
	int money1 = 0;
	time = kbd.nextInt();
	
	
	                        
	if (time>=240) {                       
		money= 2500;
		time= time-240;
	}
	else if( time >=30){		
		
		time -= 30;             
	}else {
		time=0;
	
	             }
	money +=(time/10)*100;
        System.out.println("주차장 요금 : "+money);
       
	
	
	
	
	}

}


/* 제어문
 
   조건문 - if , switch
  
   1.
   if (조건식){
      조건식이 참일경우 실행할 코드 ; 
   }
   
   2.
   if(조건식){
     조건식이 참일 경우 실행할 코드 ; 
   }else{
     조건식이 거짓일 경우 실행할 코드;
   }
   
   3.
   if(조건식1){
     조건식이 참일 경우 실행할 코드 ; 
   }else {
     조건식1이 거짓일 경우 실행할 코드;
   }if(조건식2){
     조건식2가 참인경우 실행
   }
   
   4.
   if(조건식1){
     조건식 1이 참일경우 실행
   }else if (조건식2){
     조건식 2가 참인경우 실행
   }
*/

