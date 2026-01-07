package std20260106;

public class Array2 {

	public static void main(String[] args) {
		
//		int[] num1 = {10,20,30,50,80};
//		int[] num2 = {5,4,33,99,123};
//		
//		for(int i=0;i<num1.length;i++) {
//			System.out.println(num1[i]);
//		    for(int k=0;k<num2.length;k++) {
//		    	System.out.println(" "+num2[k]);
//		    }
//		}
 
//         int[] bingo= new int[25];
//         for(int i=1;i<=25;i++) {
//        	 bingo[i-1]=i;
//         }
//		 for(int j=0;j<5;j++) {
//			 for(int k=0;k<5;k++) {
//				 System.out.println( bingo[j*5+k] );
//			 }
//		 }
		int[] num= new int[25];
		 
		 for(int i=0;i<=24;i++) {
			 int ran = (int)Math.floor(Math.random()*100)+1;
			 num[i] =ran;
			 
			 for(int j=0;j<=i;j++)
				 if(num[i]==num[j])
			  num[i]=(int)Math.floor(Math.random()*100)+1;
		 }
		 for(int play : num)
		 System.out.println(play);
	}

}
