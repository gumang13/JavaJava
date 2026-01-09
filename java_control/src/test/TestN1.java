package test;

public class TestN1 {

	public static void main(String[] args) {
		int[] monthlySales= {1200,950,1430,800,1600,1700,900,1100,1550,1800,1300,2000};
		// 1월 ~12월 순서 , 단위 : 만원
        int tot=0,avg=0,a=0,h=0,l=0;
        int hig=monthlySales[0],low=monthlySales[0];
        
        for(int i=0;i<monthlySales.length;i++) {
        	tot+=monthlySales[i];
        	if(hig<monthlySales[i]) hig=monthlySales[i];
        	if(low>monthlySales[i]) low=monthlySales[i];		
        }
		avg=tot/monthlySales.length;
		for(int i=0;i<monthlySales.length;i++) {
			if(monthlySales[i]>avg) a++;
			if(monthlySales[i]==hig) h=i+1;
			if(monthlySales[i]==low) l=i+1;
		}
		System.out.println("연간 총 매출 : "+tot);
		System.out.println("월 평균 매출 : "+avg);
		System.out.println("최고 매출 월과 금액 : "+h+"월 "+hig+"만원");
		System.out.println("최저 매출 월과 금액 : "+l+"월  "+low+"만원");
		System.out.println("평균 이상 매출인 월의 개수 : "+a);
	}

}
