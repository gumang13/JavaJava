package std20260108;

public class JavaClass {

	public static void main(String[] args) {
		user u = new user();
		user u2= new user();
		user u3= u;
		
		u.age=30;
		System.out.println(u3.age);
		u.name="이순신";
		u.job="군인";
		System.out.println(u.name+" "+u.job);
		
		// 책 이름 , 저자 , 출판년도 를 저장할수 있는 클래스 정의 
		// 객체 생성하여 데이터 넣고 출력하기
		
      Book book = new Book();
      Book book1= new Book();
      
      book.name="홍길동전";
      book.wri="허균";
      book.year=1600;
            System.out.println("책이름 : "+book.name+"\n저자 : "+book.wri+"\n출판년도 : "+book.year );
      book1.name="인간관계론";
      book1.wri="데일 카네기";
      book1.year=1928;
    	    System.out.println("책이름 : "+book1.name+"\n저자 : "+book1.wri+"\n출판년도 : "+book1.year );
	 
	
	}

}

class user{                 // user 라는 이름의 클래스 정의 
	
	int age;
	String name;
	String job;
}
class Book{
	String name;
	String wri;
	int year;
}











/*
   자바 클래스
   
   데이터 저장 방법 - 변수 , 배열 , 구조체 , 클래스 

*/