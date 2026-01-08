package std20260108;

public class JavaClass2 {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		// new Movie() 생성자 메서드
		System.out.println(movie.title);
		
		movie.title="홍길동";
		movie.dir="허균";
		movie.limitAge=12;
		movie.year=1600;
		
       Movie movie2=new Movie("굿포춘",2026);
       
       System.out.println(movie2.title);
       System.out.println(movie2.year);
       
       // Music 클래스의 객체 생성하여
       // 음악제목, 가수 , 재생시간 (총몇분) 저장되게 하기
       // 매개변수 있는 생성자 메서드로 데이터 저장하고
       // 출력하기
       
       Music music = new Music("너라는걸","조문근",220);
       System.out.println("곡명 : "+music.musicName);
       System.out.println("가수 : "+music.singer);
       System.out.println("재생새간 : "+music.songtime);
       
       Music music2 = new Music();
	}

} 
