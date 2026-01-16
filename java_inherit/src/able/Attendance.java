package able;

public interface Attendance {
	
      void checkIn();           // 출석
      void checkOut();          // 퇴실
      boolean isPresent();      // 현재 출석 상태
}
/*
   출결 시스템 만들기
   출결은 무엇을 해야 하는가 ? 
   출석 ,퇴실 ,현재 출석 상태
   
   카드 출결 클래스 
   카드 찍는다.
   찍었을대 출석 ture, 퇴실하면 false
   
   앱 출결 클래스 
   앱 실행 한다.
   QR찍는다 . 출석 true , 퇴실 false
   
   

*/