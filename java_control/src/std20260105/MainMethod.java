package std20260105;

import java.util.Random;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

		// Integer.parseInt()   정수값으로 변경
		// Math.floor() 소수점 자르기
		
//		int num = (int)Math.floor(Math.random()*10+1);
//		
//		
//		System.out.println(num);
		
	    // 동전의 앞면 뒷면 맞추기
		
//		Scanner kbd = new Scanner(System.in);
//		
//		int coin =(int)Math.floor(Math.random()*2)+1;
//		// 1-앞면 , 2- 뒷면
//		
//		System.out.println("1은 앞면 , 2는 뒷면\n입력 : ");
//		int user = kbd.nextInt();
//		
//		if(user==coin) {
//			System.out.println("맞췄습니다");
//		}else {
//		    System.out.println("틀렸습니다");
//		}
//		System.out.println("1~6 숫자를 써주세요");
		Scanner kbd = new Scanner(System.in);
		
//		int dice = (int)Math.floor(Math.random()*6)+1;
//		
//		int user =  kbd.nextInt();
//		
//		if(dice==user) {
//			System.out.println("맞췄습니다");
//		}else {
//			System.out.println("틀렸습니다");
//		}
		// 컴퓨터 주사위
//		int com = (int)Math.floor(Math.random()*6)+1;
//		
//		// 사용자 주사위
//		int user =(int)Math.floor(Math.random()*6)+1;
//		
//		// 내가 컴퓨터 보다 큰지,작은지,같은지
//		
//		
//	    if(user==com||user==1&&com==6)	{
//	       if (user==6&&com==1) {
//	    	   System.out.println("졌습니다");
//	    }
//		    System.out.println("비겼습니다");
//	}else if (user>com)    
//		    System.out.println("이겼습니다");
//        else 
//        	System.out.println("졌습니다");
	    
		// 컴퓨터와 함께하는 가위바위보 게임 
		// 1 가위 2 바위 3 보
		// 컴퓨터 가위바위보 랜덤
		// 나의 가위바위보 값은 키보드입력
		System.out.println("가위바위보 게임 (1 가위 2바위 3보 )\n입력하세요 :");
		
		
		int com = (int)Math.floor(Math.random()*3)+1;
		int rcp = kbd.nextInt();
		String result,result1="";
		
		if(com==1)
			result="가위";
		else if(com==2)
			result="바위";
		else
			result="보";
		
		if(rcp==1)
			result1="가위";
		else if(rcp==2)
			result1="바위";
		else
			result1="보";
		System.out.println("내가 낸것 : "+result1);
		System.out.println("컴퓨터가 낸것 : "+result);
		
		int res = rcp-com;
		if(res==0) {
			System.out.println("비겼습니다");
		}else if(res==-2||res==1) {
			System.out.println("이겼습니다");
		}else {
			System.out.println("졌습니다");
		}
		
		
		
//		if((rcp==1&&com==3)||(rcp==2&&com==1)||(rcp==3&&com==2))
//			System.out.println("이겼습니다");
//		else if ((com==1&&rcp==3)||(com==2&&rcp==1)||(com==3&&rcp==2))
//		    System.out.println("졌습니다");
//		else 
//			System.out.println("비겼습니다");
//		
		
		
		
	
	
	
	}

}
