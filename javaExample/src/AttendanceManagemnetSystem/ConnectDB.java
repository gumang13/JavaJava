package AttendanceManagemnetSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectDB {
	  private String dbUrl ="jdbc:mysql://localhost:3306/gumang13?severTimezone=Asia/Seoul";
      private	String dbUsr ="gumang13";
      private	String dbPwd ="123456";
	    private Scanner kbd = new Scanner(System.in);
   private	Connection conn= null;
   	private PreparedStatement pstmt = null;
   private	ResultSet rs = null;
   private	int student_id=0;
   	private int course_id=0;
   	private long attendance=0;
   	
   	

   	
    public void dbClose(ResultSet rs,PreparedStatement pstmt,Connection conn) {
		try {
			if(rs!=null) {rs.close();}
			if(pstmt!=null) {pstmt.close();}
			if(conn!=null) {conn.close();}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
    
    public List<Attendance> viewAttendance() {
    	List<Attendance> list=new ArrayList<>();	 
         String sql = "select * from attendance";

    	try {
    		
    		System.out.println("조회하고싶은 학생의 이름을 입력하세요");
    	
			String name=kbd.nextLine();
			
    		Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			
			String sql_ ="";
			sql_ += "select id from student where name=?";
			pstmt = conn.prepareStatement(sql_);
			pstmt.setString(1,name);
			rs =pstmt.executeQuery();
			if (rs.next()) {   
                 student_id = rs.getInt("id");
			}else {
				System.out.println("없는 이름입니다");
			}
		
    		
    	     sql_ = "select * from attendance where student_id=?";
    		pstmt.setInt(1,student_id);
    		pstmt = conn.prepareStatement(sql_);
    		rs = pstmt.executeQuery();
    		
    		while (rs.next()) {
    		    

    		}
    	} catch (Exception e) {
    		System.out.println("드라이버 로딩 실패 또는 접속 실패");
    	} finally {
    		try {
    			dbClose(rs, pstmt, conn);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

    	}
    	return list;
		
    }			

    
   	public void attendance() {
   		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//-----------------------------------------------------
			int student_id =0;
			int course_id=0;
			int result=0;
			System.out.println("이름을 입력하세요");
			String name=kbd.nextLine();
			System.out.println("과목을 입력하세요");
			String course=kbd.nextLine();
			String sql_ ="";
			sql_ += "select id from student where name=?";
			pstmt = conn.prepareStatement(sql_);
			pstmt.setString(1,name);
			rs =pstmt.executeQuery();
			if (rs.next()) {   
                 student_id = rs.getInt("id");
			}else {
				System.out.println("없는 이름입니다");
			}
			sql_="select id from course where name=?";
			pstmt = conn.prepareStatement(sql_);
			pstmt.setString(1,course);
			rs =pstmt.executeQuery();
			if (rs.next()) {  
                 course_id = rs.getInt("id");
			}else {
				System.out.println("없는 과목입니다");
			}
	//-------------------------------------------------------------------------------------------------------------------------------------
			while(true) {// 출결 등록 
				System.out.println("항목을 선택해주세요");
				System.out.println("1.출석 2.지각 3.조퇴 4. 외출 5.결석 6. 종료");
			 boolean attendance_=true;
			 boolean tardiness=true;
			 boolean leaveEarly=true;
			 boolean outing=true;
			 boolean absence=true;
				String userInput=kbd.nextLine();
		 // 출석 -  1씩증가     //   지각 - 1000씩 증가 // 조퇴 - 100,000씩 증가 // 외출 - 10,000,000(천만)씩 증가 // 결석 - 1,000,000,000  (10억) 씩 증가
		        if (userInput.equals("1")) {
		        	System.out.println("출석");
		        	if(attendance_) {
		        	attendance+=1;
		        	attendance_=false;
		        	}else{System.out.println("이미 출석 처리 됐습니다");}
		        }
		        else if (userInput.equals("2")) {
		        	System.out.println("지각");
		        	if(tardiness) {
		        		if(attendance_) {
		        			attendance+=1;
		        			attendance_=false;
		        		}
		        		attendance+=1000;
		        		tardiness=false;
		        	}
		        	
		        }
		        else if (userInput.equals("3")) {
		        	System.out.println("조퇴");
		        	if(leaveEarly) {
		        		if(attendance_) {
		        			attendance+=1;
		        			attendance_=false;
		        	}attendance+=100000;
		        	leaveEarly=false;
		        	}
		        }
		        else if (userInput.equals("4")) {
		        	System.out.println("외출");
		        	if(outing) {
		        		if(attendance_) {
		        			attendance+=1;
		        			attendance_=false;
		        	}
		        	}outing=false;
		        	attendance+=10000000;
		        	
		        }
		        else if (userInput.equals("5")) {
		        	System.out.println("결석");
		        	if(attendance==0) {
		        		attendance+=1000000000;
		        	}
		        	else {
		        		System.out.println("잘못된 입력입니다");
		        	}
			}
		        else if (userInput.equals("6")) {
		        	System.out.println("출결 프로그램을 종료합니다");
		        	break;
		        }
		        else {
		        	System.out.println("다시 입력해 주세요");
		        }
				
				
			}
			
			
			String sql ="";
			sql += "insert into attendance(student_id,course_id,attendance_code,date) values";
			sql += "(?,?,?,now())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student_id);
		
			pstmt.setInt(2, course_id);
			pstmt.setLong(3,attendance); 
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
   	}

}
