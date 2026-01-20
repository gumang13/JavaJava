package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원 수정 프로그램
public class MemberUpdate {
    public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("수정할 아이디 : ");
		String id=kbd.nextLine();
		
		System.out.print("새로운 이름 : ");
		String name=kbd.nextLine();
		
		System.out.print("새로운 전화번호 : ");
		String phone=kbd.nextLine();
		
		String dbUrl ="jdbc:mysql://localhost:3306/javaExample?severTimezone=Asia/Seoul";
 		String dbUsr ="javaUser";
		String dbPwd ="1234";
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			
			String sql = "update member set name = ?,phone = ? where id = ?";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, id);
			
			int result =pstmt.executeUpdate();
			if(result>0) {
				System.out.println("수정성공");
			}else {
				System.out.println("실패");
			}
			//-----------------------------------------------------
		}catch(Exception e){
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-- 프로그램 종료 --");
	}
}
