package std20260108;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		
		// 이정도 까지는 해야한다 - 배열실습
		
		// 문제 1. 10개의 무작위 정수 값 저장 ( 배열에 )
		//        랜덤 범위는 1~50 
		
		
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//				int ran=(int)Math.floor(Math.random()*50)+1;
//					arr[i]=ran;
//		     for (int k =0;k<i;k++) {
//		    	 if(arr[i]==arr[k]){
//		    		 i--;
//		    	 }
//		    }
//		    System.out.println(arr[i]);
//		}
//		
		//문제 2 
		// int [] score = {99,66,77,56,78,98,83};
		// 1학년 3반 학생들의 성적을 배열에 저장하였다.
		// 3반 학생들 성적의 평균값을 구하세요
        // 반복문을 이용하여 하기		
//		int sum=0,avg=0;
//		int [] score = {99,66,77,56,78,98,83};
//		for(int i=0;i<score.length;i++) {
//			sum+=score[i];
//		}
//		   avg=sum/score.length;
//		   System.out.println("반 총점 : "+sum);
//		   System.out.println("반 평균 : "+avg);

		// 문제 3 . 정수 10개를 저장할수 있는 배열을 선언
//		//         1부터 50까지 무작위 수로 배열을 저장하기 
//		//         배열의 첫번째 값과 마지막 값 출력
//         		
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			int ran=(int)Math.floor(Math.random()*50)+1;
//			
//			arr[i]=ran;
//		}
////		System.out.println(arr[0]+" "+arr[arr.length-1]);
//
//		// 문제 4 . 문제3번의 배열에 저장된 무작위 정수중 짝수에 해당하는 정수만 출력하기
//     
//		for(int k=0;k<arr.length;k++) {
//			if(arr[k]%2==0)
//				System.out.println(arr[k]);
//		}
//		
//		// 문제5 . 마지막
		//      int[] temp = { 6, 0, 5, -2, 0, 4, 6, 0 }
		//         temp 배열은 일별 최고 기온을 저장 한 것이다
		//           배열에 저장된 기온중 가장 높은 기온과 가장 낮은 기온을 찾으세요
		//          0번 인덱스의 기온은 12월 11일 데이터이다.
		//            가장 높은 기온의 날짜와 가장 낮은 기온의 날짜를 출력
		//     
		
		int max=0,min=0;
		int[] temp = { 6, 0, 5, -2, 0, 4, 6, 0 };
		for(int i=0;i<temp.length;i++) {
			if (max < temp[i])  max=temp[i];
		    if (min > temp[i])  min=temp[i];
					
			}
		
		for(int i=0;i<temp.length;i++) {
			if(max==temp[i]) {
				System.out.println("최고 기온 날짜 12월 "+(i+11)+"일");
		        System.out.println("최고기온 : "+max);
			}if(min==temp[i]) {
				System.out.println("최저 기온 날짜 12월 "+(i+11)+"일");
		        System.out.println("최저기온 : "+min);
	        }
		}
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
        System.out.println("최고 기온 : "+max+"  날짜 :"+maxDay);
        System.out.println("최저 기온 : "+min+"  날짜 :"+minDay);
	}
}
