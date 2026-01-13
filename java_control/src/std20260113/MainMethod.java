package std20260113;

import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		
//		User[] users=new User[5];
//		
//		users[0] = new User("짱구","철수","유리","맹구");
//		users[0].setName("이순신");
//	    	
//		System.out.println(users[0].getName());
//		System.out.println(users[0]);
           // 변수 타입이 달라질 경우 주의
		User[] users = {
				new User("짱구","철수","유리","맹구"),
				new User("lee","01234","이성계","0102121121"),
				new User("kim","a12345","거북선","05151584"),
				new User("park","b12345","박지성","5187815"),
				new User("choi","c12345","최현석","8181854")
		}; 
		
		UserService us = new UserService();
//		us.findId(users);
//		us.findPassword(users);
//		System.out.println(Arrays.toString(users));
		
		us.login(users);
		
	}

}
