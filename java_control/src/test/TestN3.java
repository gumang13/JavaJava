package test;

import java.util.Arrays;

public class TestN3 {

	public static void main(String[] args) {
		int[] consult= {12,8,15,15,3,9,20};// 월~일  상담
		int[] contract={2,1,3,0,0,1,4};    //       계약
        int[] clame= {0,1,0,2,1,0,3};      //      클레임
        int[] dan= new int[7];
        int[] bes= new int[7];
        
        
        int max=0,max1=0,maxday=0,maxday1 = 0;
	    int cssum=0,ctsum=0,clsum=0;
	    int jun=0,junM=0,junD=0;;
	    String[] day= {"월","화","수","목","금","토","일"};
	    
	    for(int i=0;i<consult.length;i++) {
	    	cssum+=consult[i];
	    	ctsum+=contract[i];
	    	clsum+=clame[i];
	    	
	    	
	    	jun=(int) (((double)contract[i]/(double)consult[i])*100);        //전환율 구하기
	    	
	    	if(junM<jun) {junM=jun;             //전환율 최대값 찾기
	    }
	    
	    	
	    }
	    for(int i=0;i<consult.length;i++) {
	    	
	       if(clame[i]>=2||(consult[i]>=10&&contract[i]==0)) {  //위험요일찾기
	    	   dan[i]=1;
	       }
	       bes[i]=(contract[i]*5)+consult[i]-(clame[i]*4);
	       if(bes[i]>max) {max=bes[i]; }                           
	    	   
	    }  
	     for(int i=0;i<consult.length;i++) {
	    	 if(max>bes[i]) {
	    		 if(max1<bes[i]) max1=bes[i];
	    	 }
	     }
	     
	    for(int i=0;i<consult.length;i++) 
	    	if(max==bes[i]) {maxday=i;break;}
	    for(int i=0;i<consult.length;i++) 
	    	if(max1==bes[i]) {maxday1=i;break;}
	    for(int i=0;i<consult.length;i++)
	        if(junM==(int) (((double)contract[i]/(double)consult[i])*100)) {junD=i;break;}
	        	
	    
	     
	     
	     
	     System.out.println("주간 상담 총합 : "+cssum);
	     System.out.println("주간 계약 총합 : "+ctsum);
	     System.out.println("주간 클레임 총합 : "+clsum);
	     System.out.println();
	     System.out.println("최고 전환율 : "+day[junD]+"요일"+"("+junM+"%)");
	     System.out.println("위험 요일 : ");
	     for(int i=0;i<consult.length;i++)
	    	 if(dan[i]==1) {
	     System.out.println("- "+day[i]+"요일");	     
	    	 }
	     System.out.println("1등 : "+day[maxday]+"(점수 : "+max+")");
	     System.out.println("2등 : "+day[maxday1]+"(점수 : "+max1+")");   
	    		
	    
	   
	    	
	    	
		    	 
	    	
	    
	    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
