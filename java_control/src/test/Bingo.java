package test;

import java.util.Arrays;

public class Bingo {
	// 배열을 생성하는 메서드
       private int[] arr = new int[25];
	

	public Bingo() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)Math.floor(Math.random()*50)+1;
		  for(int k=1;k<i;k++) {
			  if(arr[i]==arr[k]) {
				  i--;
				 
			  }
		  }
		}
		System.out.println("빙고가 생성 되었습니다");
		System.out.println(Arrays.toString(arr));
	}
       
       
         
        	  
          
          
          
        	  
}     

