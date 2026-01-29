package _imsi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Tally_tally {
	
	
public Tally load() {
	
	Tally tally = new Tally();
		
		
	
	private String dbDrv = "com.mysql.cj.jdbc.Driver";
	private String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
	private String dbUser = "javaUser";
	private String dbPwd = "1234";

	private  Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// 예외처리
	try {
		Class.forName(dbDrv);
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
		String sql = "select * from attendance where student_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, tally.getStuId());
		rs = pstmt.executeQuery();
		if (rs.next()) {
			tally.setId(rs.getInt("id"));
			tally.setStudent_id(rs.getString("student_id"));
			tally.setCourse_id(rs.getString("course_id"));
			tally.setAttendance_code(rs.getLong("attendance_code"));
			tally.setAttendance_date(rs.getDate("attendance_date"));
			

		}
	} catch (Exception e) {
		System.out.println("드라이버 로딩 실패 또는 접속 실패");
	} finally {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	System.out.println("ㅡㅡ 프로그램 종료 ㅡㅡ");

	return tally;
		

	
	
}
}

