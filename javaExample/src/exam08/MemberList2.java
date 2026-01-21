package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList2 {

	public static void main(String[] args) {
		List<MemberDTO> list = new ArrayList<>();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbUrl ="jdbc:mysql://localhost:3306/javaExample?severTimezone=Asia/Seoul";
 		String dbUsr ="javaUser";
		String dbPwd ="1234";
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();           //변화값이 없을때 executeQuery 변화값이 있으면 executeUpdate
			while(rs.next()) {
//				int no = rs.getInt("no");
//				String id=rs.getString("id");
//				String password=rs.getString("password");
//				String name=rs.getString("name");
//				String phone=rs.getString("phone");
//				Date createdDate=rs.getDate("createdDate");
				
				MemberDTO memberDTO=new MemberDTO();
				memberDTO.setNo(rs.getInt("no"));
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPassword(rs.getString("password"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));;
				memberDTO.setCreatedDate(rs.getDate("createdDate"));;
				
				list.add(memberDTO);
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

		for(int i=0;i<list.size();i++) {
			System.out.printf("%s \t %s \t %s \t %s \t %s\n",
					list.get(i).getNo(),list.get(i).getId(),list.get(i).getName(),
					list.get(i).getPhone(),list.get(i).getCreatedDate());
		}
		
		
		
		System.out.println("-- 프로그램 종료 --");

		
		
		
		
	}

}
