package exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Main {
	public static void main(String[] args) {
		    Scanner kbd = new Scanner(System.in);
		    List<Member> list = new ArrayList<>();
		    
		    
		    while(true) {
		                                            
		    	String user= kbd.nextLine();
		    if(user.equals("0")) {
		    	break;
		    }else if(user.equals("1")) {
		    	System.out.println("-------회원 목록-------");
		    	for(int i=0;i<list.size();i++) {System.out.println( list.get(i).getName());} 
		    	
		    }else if(user.equals("2")) {
		    	System.out.println("-------회원 상세보기-------");
		    	System.out.println("상세보기 할 아이디를 입력하세요");
		    	String userInput= kbd.nextLine();
		    	for(int i=0;i<list.size();i++) {
		    		if(list.get(i).getName().equals(userInput)) {
		    			list.get(i).toString();
		    		}else {
		    			System.out.println("일치하는 회원 정보가 없습니다");
		    		}
		    			    		
} 
		    	
		    }else if(user.equals("3")) {
		    	System.out.println("-------회원 등록-------");
		    	System.out.println("사용할 아이디를 입력하세요");
		    	String id =kbd.nextLine();
		    	
		    	System.out.println("사용할 비밀번호를 입력하세요");
		    	String password =kbd.nextLine();
		    	
		    	System.out.println("이름을 입력하세요");
		    	String name =kbd.nextLine();
		    	
		    	System.out.println("핸드폰 번호를 입력하세요");
		    	String phone =kbd.nextLine();
		    	
		    	System.out.println("주소를 입력하세요");
		    	String address =kbd.nextLine();
		    	Member member=new Member(id,password,name,phone,address);
		    	list.add(member);
		    	
		    	System.out.println("등록이 완료 되었습니다");
		
		    }else if(user.equals("4")) {
		    	System.out.println("-------회원 수정-------");
		    	System.out.println("수정할 아이디를 입력해 주세요");
		    	String userInput= kbd.nextLine();
		    	for(int i=0;i<list.size();i++) {
		    		if(list.get(i).getName().equals(userInput)) {
		    			System.out.println("삭제할 계정의 비밀번호를 입력해 주세요");
		    			String password_ =kbd.nextLine();
		    			
		    			if(list.get(i).getPassword().equals(password_)) {
		    			 System.out.println("사용할 아이디를 입력하세요");
		 		    	String id =kbd.nextLine();
		 		    	list.get(i).setId(id);
		 		    	
		 		    	System.out.println("사용할 비밀번호를 입력하세요");
		 		    	String password =kbd.nextLine();
		 		    	list.get(i).setPassword(password);
		 		    	
		 		    	System.out.println("이름을 입력하세요");
		 		    	String name =kbd.nextLine();
		 		    	list.get(i).setName(name);
		 		    	
		 		    	System.out.println("핸드폰 번호를 입력하세요");
		 		    	String phone =kbd.nextLine();
		 		    	list.get(i).setPhone(phone);
		 		    	
		 		    	System.out.println("주소를 입력하세요");
		 		    	String address =kbd.nextLine();
		 		    	list.get(i).setAddress(address);
		 		    	
		 		    	System.out.println("회원정보 수정 완료 !!");
		    			}else {System.out.println("정보가 일치하지 않습니다");}
		    			
		    		}else {
		    			System.out.println("일치하는 회원 정보가 없습니다");
		    		}
		    	}
		    }else if(user.equals("5")) {
		    	System.out.println("-------회원 삭제-------");
		    	System.out.println("삭제할 계정의 아이디를 입력해 주세요");
		    	String userInput= kbd.nextLine();
		    	for(int i=0;i<list.size();i++) {
		    		if(list.get(i).getName().equals(userInput)) {
		    			System.out.println("삭제할 계정의 비밀번호를 입력해 주세요");
		    			String password =kbd.nextLine();
		    			
		    			if(list.get(i).getPassword().equals(password)) {
		    				
		    				list.remove(i);
		    				System.out.println("회원정보 삭제 완료 !!");
		    			}else {System.out.println("정보가 일치하지 않습니다");}
		    			
		    		}else {
		    			System.out.println("일치하는 회원 정보가 없습니다");
		    		}
		    	}
		    }else {
		    	System.out.println("올바르지 않은 접근입니다.");
		    }
		
		
		
		    }
		
		     System.out.println("프로그램 종료 !!");
		
		
		
		
		
		
		
		
		
		

	}

}
