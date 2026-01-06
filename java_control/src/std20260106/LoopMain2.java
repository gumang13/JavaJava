package std20260106;

import java.util.Scanner;

public class LoopMain2 {

	public static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("=========숫자야구=========");
		
		int com1=0,com2=0,com3=0;
	    while(true) {
	    	 com1 = (int)Math.floor(Math.random()*9)+1;
	    	 com2= (int)Math.floor(Math.random()*9)+1; ; 
	    	 com3= (int)Math.floor(Math.random()*9)+1; ;
	    	if((com1!=com2)&&(com2!=com3)&&(com3!=com1)) {
	    		break;
	    
		
	    }}
	    while(true) {
	    	int str=0,ball=0,out=0;
	    	System.out.println("1~9중 숫자 세개 입력 : ");
	    	int user1 = kbd.nextInt();
	    	int user2 = kbd.nextInt();
	    	int user3 = kbd.nextInt();
	    	if(com1==user1)
	    		str++;
	    	else if(com1==user2||com1==user3)
	    		ball++;
	    	else 
	    		out++;
	    	if(com2==user2)
	    		str++;
	    	else if(com2==user1||com2==user3)
	    		ball++;
	    	else 
	    		out++;
	    	if(com3==user3)
	    		str++;
	    	else if(com3==user2||com3==user1)
	    		ball++;
	    	else 
	    		out++;
	    	
	    	System.out.println("스트라이크 : "+str+"// 볼 : "+ball+"// 아웃 : "+out);
	    	if (str==3) {
	    		System.out.println("이겼습니다");
	    		break;}
	    	
	    	
	    	
	    }
		
	 
		
		
		
		
		
		
		
		
		
		
//		System.out.println("1~50 중 입력 : ");
//		int user = kbd.nextInt();
//		int com=0;
//		int j = 1,t=50;
//		while(true) {
//		
//			 com = (int)Math.floor(Math.random()*t)+j;       
//			
//			if(com>user) {  
//				System.out.println("Down"+com);
//				t=com-j;
//				t--;					       
//			}else if(com<user) {
//				System.out.println("up"+com);
//				int j1=j;
//				j=com;
//				t=t-j+j1;
//				j++;
//		    }
//			else{
//				System.out.println("정답!!");
//				break;
//			} 
//		}

	}

}
