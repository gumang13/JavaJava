package test;

public class TestN2 {

	public static void main(String[] args) {
		int[] attendance= {1,1,2,1,3,1,2,3,1,1,1,2,3,3,1};
		int a =0;     // 출석
		int b =0;     // 지각
		int c =0;     // 결석
		int d =0;     // 출결점수
		for(int i=0;i<attendance.length;i++) {
			if(attendance[i]==1) {a++; d++;}
			if(attendance[i]==2)  b++;
			if(attendance[i]==3) {c++; d--;}
		}
		if(c>=3||d<=8)System.out.println("출결 위험");

	}

}
