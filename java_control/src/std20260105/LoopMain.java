package std20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {
		
//       for(int i=1;i<=10;i++) {
//       System.out.println(i);
//       }  

//		for(int i=1;i<=100;i++){
//		    if(i%10==0)
//		    	System.out.println(i);
//		}
//		
		
		Scanner kbd= new Scanner(System.in);
		
//		System.out.println("정수 입력 : ");
//		int num = kbd.nextInt();
//		
//		for(int i =1;i<=num;i++) {
//			System.out.println(i);
//		}
		
        // 1부터 12까지 출력하는데 
		//  4의 배수에는 four 라고 출력하시오
//		for(int i =1; i<=12;i++) {
//			if(i%4==0) {
//				System.out.println("four");
//			}else
//				System.out.println(i);
//		}
//		int j=0;
//		for(int i =1;i<=1000;i++) {
//			if(i%17==0) {
//				j++;
//			}
//		}
//		System.out.println(j);
		
		
		// 문제
		// 동전 앞면 뒷면 맞추기 게임
		// 게임 총 10판 진행하기
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기
//		System.out.println("아무숫자나 누르세요");
//		int user = kbd.nextInt();
//		System.out.println("숫자를 입력하세요 1=앞면 2=뒷면");
//		int count=0;
//		for(int i=1;i<=10;i++) {
//			
//			int ran = (int)Math.floor(Math.random()*2)+1;
//			System.out.println("숫자를 입력하세요 1=앞면 2=뒷면");
//			kbd.next();
//			
//			if(ran==user) {
//				count++;
//				System.out.println("맞췄습니다");
//			}else {
//				System.out.println("틀렸습니다");
//			}
//		}System.out.println("총 맞춘 갯수"+count);
	
		
//		int i = 10;
//		while(true) {
//			System.out.println(i);
//			i++;
//			if(i==40)
//				break;
//		}
		
//		while(true) {
//			int num = (int)Math.floor(Math.random()*20)+1;
//					System.out.println(num);
//					if (num==11)
//						break;
//		}
//		int com = (int)Math.floor(Math.random()*50)+1;
//		
//		while(true) {
//		     System.out.println("1~50 중 입력 : ");
//		     int user = kbd.nextInt();
//		     if(user>com) {
//		    	 System.out.println("Down");
//		     }if(user<com) {
//			System.out.println("up");
//		     }if(user==com) {
//			System.out.println("정답!!");
//		    break;
//		}
//		}
		
		
			System.out.println("1~50 중 입력 : ");
		int user = kbd.nextInt();
		int b=0,com=0;
		int j = 1,t=50;
		while(true) {
		
			 com = (int)Math.floor(Math.random()*t)+j;       
			
			if(com>user) {  
				System.out.println("Down"+com);
				t=com-j;
									       
			}else if(com<user) {
				System.out.println("up"+com);
				int j1=j;
				j=com;
				t=t-j+j1;
		    }
			else{
				System.out.println("정답!!");
				break;
			} 
		}
		
		
		
		
		
		
		
		
//		1/5 과제 
//		
//		가위 바위 보 게임을 15판 진행
//		게임을 진행 하면서 1판 끝날때 마다 
//		몇승 ,몇패 ,몇무 출력하기
		

//		int win=0,dra = 0,los=0;
//		String rcp="";
//		for(int i =1;i<=15;i++) {
//			System.out.println("가위바위보 게임을 시작합니다\n1=가위,2=바위,3=보");
//			int user=kbd.nextInt();
//			int com= (int)Math.floor(Math.random()*3)+1;
//			if(user==1)
//				rcp="가위";
//			else if (user==2)
//				rcp="바위";
//			else
//				rcp="보";
//			System.out.print("내가 낸것 : "+rcp+"  //");
//			if(com==1)
//				rcp="가위";
//			else if (com==2)
//				rcp="바위";
//			else
//				rcp="보";
//			System.out.println("컴퓨터가 낸것 : "+rcp);
//			
//			if(user==com) {
//				System.out.println("비겻습니다");
//				dra++;
//			}else if (user-com==-2 || user-com==1) {
//				System.out.println("이겼습니다");
//				win++;
//			}else { 
//				System.out.println("비겼습니다");
//			   los++;}
//			System.out.println("이긴횟수 : "+win+"  진횟수 : "+los+"  비긴횟수 : "+dra);
//			
//		}
//		
		
		
		
		
	
	}

}




/*  
    
     
     
     
     
     
     
     
     
     
     반복문 - for , while , do~while 
     반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정 이다. 또는 횟수의 제한 없이
     돚악 시킬 수 있다.
     
     for문 
     
     for(){
        반복 실행할 내용;
        반복 실행 할 내용;
     }
     1부터 시작하여 1씩 증가하는 형태로 반복문을 작성.
     그래야 몇번 반복 시킬것인지 작성하기도 편하고 파악하기도 빠름
     
     
     

*/

    		

