package std260102;

public class Practice {
	 	 			
public static void main(String[] args) {
	//길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.
	//난수로 채운 배열에서 최댓값과 최솟값을 찾아 출력하시오
	
	int[] A= new int[10];
	A[0]=(int)Math.floor(Math.random()*100)+1;
	int max =A[0] ;
	int min =A[0] ;
	for(int i=1;i<A.length;i++) { 
		int r	= (int)Math.floor(Math.random()*100)+1;
				A[i]=r;
	System.out.println(A[i]);
	}for(int i=0;i<A.length;i++) {
		if(A[i]>max) max=A[i];
		if(A[i]<min) min=A[i];
		
		
		
		
	}
		
	System.out.println("최댓값 : "+max);
	System.out.println("최솟값 : "+min);
	
	
}
}


