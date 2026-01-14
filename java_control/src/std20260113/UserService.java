package std20260113;

import java.util.Scanner;

public class UserService {
	
	private Scanner kbd = new Scanner(System.in);
	// 아이디 찾기 메서드
	// 이름을 입력하여 아이디 찾기 할것이다.
	// 매개변수 우리가 행동하기위해 필요한 정보
	public void findId(User[] users) {
		System.out.println("====아이디 찾기 ====");
		System.out.print("이름 입력 : ");
		String name = kbd.nextLine();
		
		for(User user : users) {
			if(user.getName().equals(name)) {
				System.out.println(user.getId());
				break;
			}
		}
	}
		
     public void findPassword(User[] users) {
    	 System.out.println("====비밀번호 찾기====");
    	 System.out.println("아이디 입력 : ");
    	 String id = kbd.nextLine();
    	 System.out.println("연락처 입력 : ");
    	 String tel= kbd.nextLine();
    	 boolean isDis = true;
    	 for(User user : users) {
    		 if(user.getId().equals(id)&&user.getTel().equals(tel))
    			 System.out.println("변경할 비번 입력 : " );
    		 String pw = kbd.nextLine();
    		 user.setPassward(pw);
    		 System.out.println("변경 되었습니다");
    		 isDis= false;
    		 break;
    	 }
    	 if(isDis) {
    		 System.out.println("일치하는 정보가 없습니다, 다시 입력하세요");
    	 }
    	 
    	 
     }
     public void login(User[] users) {
    	 
    	 System.out.println("====로그인====");
    	 System.out.println("Id를 입력해주세요");
    	 String id=kbd.nextLine();
    	 System.out.println("password를 입력해주세요");
    	 String password=kbd.nextLine();
    	 
    	 User temp = isID(users,id); // 입력한 아이디와 일치하는 User 객체 찾기
    	 if(temp.getPassward().equals(password)) {
    		 System.out.println("로그인 성공");
    	 }
    	 else {
    		 System.out.println("아이디 또는 비밀번호가 잘못되었습니다");
    	 }
//    	 boolean isLogin=true;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
//    	 for(User user : users) {
//    		 if(user.getId().equals(id)&&user.getPassward().equals(password)) {
//    			System.out.println("로그인 성공 !!"); 
//    			isLogin=false;
//    			break;
//    		 }
//    		 
//    	 }
//    	 if(isLogin) {
//    		 System.out.println("아이디 또는 비밀번호가 틀렸습니다");
//    	 }
    	 
     }
     
     private User isID(User[] users,String id) {
    	 for(User user : users) {
    		 if(user.getId().equals(id))return user;
    		 // 아이디가 일치하는 User 객체를 반환
    	 }
    	 return new User();        // 일치하는 아이디가 없으면 null 반환
    	 
     }
    // 로그인 메서드 
    // 아이디와 비밀번호를 입력하여  로그인하기
    // 아이디와 비밀번호가 일치하면 "로그인성공" 출력
    // 일치하지 않으면 " 아이디 또는 비밀번호가 잘못 되었습니다" 출력
	
	
	// 비밀번호 찾기 메서드 
	// 아이디와 연락처를 입력하면 비밀번호를 변경 할 수 있다.
	// 
	 

}
// 데이터를 저장 관리하기 위한 클래스 에서
// 데이터 필터링 이나 , 파일 저장 (DB), 불러오기
// 등등을 수행하지 않는다.
// 데이터 저장 관리하기 위한 클래스에서는 
// 저장에 관해 메서드를 주로 만들고 
// 데이터 변환에 대해서만 만든다.