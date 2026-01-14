package std20260114;

import java.sql.*;

public class DBConnect {
    
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		connect();            // 데이터 베이스 연결을 위한 메서드
		
	}
	
	private void connect() {
		// 데이터베이스 드라이버 실행 - 연결
		// 계정 로그인
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");  //드라이버호출
        	String username="gumang13";
       	    String password = "123456";
       	    String url="jdbc:mysql://localhost:3306/gumang13";      
      
       	    conn = DriverManager.getConnection(url,username,password);
        }catch(Exception e ) {
        	System.out.println("접속 실패!!!!");
    		e.printStackTrace(); 
        	
        }
 	}
	public GameMember[] findAll() {
		GameMember[] gameMembers = new GameMember[10];
		
		// 쿼리문 작성하기
		// 쿼리문 보내기
		// 결과 받기
		// 데이터를 클래스 객체에 저장하고 배열에 저장하기
		
		String sql="select * from game_member";
		
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			
			int i =0;
			while(rs.next()) {
				GameMember data = new GameMember(rs.getString("name"),rs.getString("birth"),
						rs.getString("nick_name"),rs.getInt("level"));
			
			    gameMembers[i] = data;
			    i++;
			}
		}catch(Exception e){
			System.out.println("질의 실패 및 객체생성 실패");
		}
		
		return gameMembers;
	}
	
	
	
}
