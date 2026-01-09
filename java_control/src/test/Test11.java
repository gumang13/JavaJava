package test;

public class Test11 {

	public static void main(String[] args) {
		int[] nums= {3,8,15,22,7,10};
		int result=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0)result+=nums[i];
			else
				result-=nums[i];
		}

		
		System.out.println("결과 : "+result);
	}

}
