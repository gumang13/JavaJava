package test;

public class Test9 {
	public static void main(String[] args) {
	       int[] arr= {10,20,30,40,50};
	       int sum=0;
	       int avg=0;
	       for(int i=0;i<arr.length;i++) {
	    	   sum+=arr[i];
	       }
	       avg=sum/arr.length;
	    		   System.out.println("배열의 합 : "+sum);
	               System.out.println("배열 평균 : "+avg);
	}

}
