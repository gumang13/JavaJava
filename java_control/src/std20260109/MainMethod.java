package std20260109;

public class MainMethod  {
     
	int score = 50 ;                //인스턴스 변수 
	// static이 붙은 메서드 에서는 인스턴스 변수나 인스턴스 메서드
	// 사용 불가 - 생성되는 시점이 다르기 때문에 사용 할 수 없다.
	
	// 인스턴스 메서드 에서는 static 변수나 , static 메서드 사용가능
	
	
	public static void main(String[] args) {
	
		Member member=new Member();
		member.name="짱구";
		member.age=5;
		
		
		Member member1=new Member("철수",5,"남자",11);
		System.out.println();
		// 클래스 외부에서 클래스 변수에 데이터 저장 하는 방법
       Member.dept="컴퓨터공학과";
	  System.out.println(member.dept);
	  System.out.println(member1.dept);
	 
	  System.out.println(member.toString());
	  System.out.println(member1);
	  
	  // 상수 
	  final int num=0;
//	  num = 20;
	  
	  // static
//	  static int aa=30;         //내부 클래스 할때만 사용 일반적으로 x
	                            // 메인 밖에서 사용
	  

	  
	  
	}

}


