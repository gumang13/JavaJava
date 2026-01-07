package std20260107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		// 1차원 배열 25의 크기
		// 배열에 무작위 숫자 저장하기( 1~100)
		
		int[] bingo = new int[25];
		
		for(int i=0; i<bingo.length;i++) {      // 향상된 for 문 (int a : bingo)
		    bingo[i]=(int)Math.floor(Math.random()*100)+1;
		  for(int k=0; k<i;k++) {
			  if(bingo[i]==bingo[k]) {
				  i--;
				  break;
			  }
		  }				
		}
		
		// 25개 숫자 빙고판 모양으로 출력하기
		// 5줄 5칸으로 출력하기
		
		// %d - 정수  ,%f- 실수   ,%c -문자 ,%s - 문자열 ,%o - 8진수 ,%x- 16진수
		while(true) {
		System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
       for(int i=0;i<5;i++) {
    	   for(int j=0;j<5;j++)
    		  if (bingo[i*5+j]==0)
    		         System.out.printf("│ %3c ",'■');
    		  else
    	   System.out.printf("│ %3d ",bingo[i*5+j]);
       if(i==4)
    	   System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
       else
       System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
       }
		
//		System.out.println(Arrays.toString(bingo));
       
       System.out.print(" 입력 : ");
       int user = kbd.nextInt();
       for(int i =0;i<bingo.length;i++) {         // 배열에서 내가 입력한 숫자 찾기
    	   if(bingo[i]==user) {                   // 입력한 값이 배열에 있다면
    		   bingo[i]= 0;                       // 화면에 체크 표시를 위해 0 으로 변경
    	   }
       }
       
       // 가로 세로 대각선 빙고 확인하기
       int end = 0;                                 // 현재 몇 빙고인지 
       int row = 0;                                 // 가로방향(줄 단위) 0의 갯수가 몇개인지 확인
	   int col = 0;
	   int cro = 0; 
	   int cros= 0;
       for(int i =0; i<5; i++) {                    // 줄 단위 표현은 i 변수이다.
		   row=0;
		   col=0;
		   if(bingo[i*6]==0) cro++;
		   if(bingo[i*4+4]==0) cros++;   
		   if(cro==5) end++;
		   if(cros==5) end++;
		   
		   for(int k=0;k<5;k++) {                   // 열 단위 표현은 k 변수이다.
			   
			   if(bingo[i*5+k]==0) row++;
			   if(bingo[i+5*k]==0) col++;
		   }
		   if(row==5) end++;                        // 해당 줄에 0이 5개라면 row 는 5개가 된다 . 즉 1빙고 완성
           if(col==5) end++;
	   }
	                                             //  0 5 10 15 20    .. 1 6 11 16 21 
	   
	
	   System.out.println(" 현재 완성 빙고 : "+end+" 줄");
		if(end>=5) {
			System.out.println("승리!!");
			break;
		}
		} 
		
	}

}
