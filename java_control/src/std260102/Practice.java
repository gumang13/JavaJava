package std260102;

public class Practice {
	 	 			
public static void main(String[] args) {
	//길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.
	//난수로 채운 배열에서 최댓값과 최솟값을 찾아 출력하시오
	
	int[] A= new int[10];
	
	int M = A[0];
	int m = A[0];
	for(int i=0;i<=9;i++) { 
		int r = (int)Math.floor(Math.random()*100)+1;
		A[i]=r;
		m = A[0];
		
		if(A[i]>M)
			M=A[i];
		else if(A[i]<m)
			m=A[i];
		
		
		System.out.println(A[i]);
	}
	System.out.println("최댓값 : "+M);
	System.out.println("최솟값 : "+m);
	
	
}
}


