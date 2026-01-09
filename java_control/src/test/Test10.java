package test;

public class Test10 {

	public static void main(String[] args) {
		//for 문 사용 if문 사용
		
		int[] score= {87,65,92,100,74};
		int max=score[0];
		int min=score[0];
		for(int i =0;i<score.length;i++) {
			if(max<score[i])max=score[i];
			if(min>score[i])min=score[i];
		}
		
		System.out.println("최댓값 : "+max);
		System.out.println("최소값 : "+min);
		

	}

}
