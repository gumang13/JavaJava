package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentDAO {
       private String dbUrl ="jdbc:mysql://localhost:3306/javaExample?severTimezone=Asia/Seoul";
       private	String dbUsr ="javaUser";
       private	String dbPwd ="1234";
	    Scanner kbd = new Scanner(System.in);
    	Connection conn= null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	
    	
    	
    public void dbClose(ResultSet rs,PreparedStatement pstmt,Connection conn) {
    		try {
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
    	}
	
    public List<StudentDTO> getSelectAll() {
    	List<StudentDTO> list = new ArrayList<>();
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			String sql ="";
			sql += "select * from student order by hakbun desc";
			
			
			pstmt = conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
             while(rs.next()) {
            	 StudentDTO dto= new StudentDTO();
            	 dto.setHakbun(rs.getInt("hakbun"));
            	 dto.setName(rs.getString("name"));
            	 dto.setSsn(rs.getString("ssn"));
            	 dto.setAddress(rs.getString("address"));
            	 dto.setCreatedDate(rs.getDate("createdate"));
            	 list.add(dto);
            	 
             }
			//-----------------------------------------------------
		}catch(Exception e){
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
			e.printStackTrace();
		}finally {
			dbClose(rs,pstmt,conn);
		} 
  
    	return list;
    }
    public StudentDTO getSelectOne(StudentDTO paramDTO) {
    	StudentDTO dto = new StudentDTO();
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
    		//-----------------------------------------------------
    		String sql ="";
    		sql += "select * from student where hakbun = ?";
    		pstmt = conn.prepareStatement(sql);
    		pstmt.setInt(1,paramDTO.getHakbun() );
    		
    		
    		rs =pstmt.executeQuery();
    		
    		//-----------------------------------------------------
    	}catch(Exception e){
    		System.out.println("드라이버 로딩 실패 또는 접속 실패");
    		e.printStackTrace();
    	}finally {
    		dbClose(rs,pstmt,conn);
    	} 
    	
    	return dto;
    }
    public int setDelete(StudentDTO dto) {
             System.out.println("삭제할 학번을 입력하세요");
             
             int result=0;
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			String sql ="";
			sql += "delete from student where hakbun=?";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,dto.getHakbun());
			
			 result=pstmt.executeUpdate();
			if(result>0) {System.out.println("삭제 성공!!");}
			else {System.out.println("삭제 실패...");}
			
				
            
			//-----------------------------------------------------
		}catch(Exception e){
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
			e.printStackTrace();
		}finally {
			dbClose(rs,pstmt,conn);
		} 
  
    	return result;
    }
    
    public int Edit(StudentDTO dto_) {
    	int result=0;
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			String sql ="";
			sql += "update student set phone = ?,address = ? where hakbun = ?";
			
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto_.getPhone());
			pstmt.setString(2,dto_.getAddress());
			pstmt.setInt(3,dto_.getHakbun());
			result =pstmt.executeUpdate();
             
			//-----------------------------------------------------
		}catch(Exception e){
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
			e.printStackTrace();
		}finally {
			dbClose(rs,pstmt,conn);
		} return result;
    }
         
	public int setInsert(StudentDTO dto) {
		
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			String sql ="";
			sql += "insert into student(hakbun,name,ssn,phone,address,createDate) values";
			sql += "(null,?,?,?,?,now())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSsn());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddress());
			result =pstmt.executeUpdate();
			if(result==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			//-----------------------------------------------------
		}catch(Exception e){
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
			e.printStackTrace();
		}finally {
			dbClose(rs,pstmt,conn);
		} 
		
		return result;
	}
}
