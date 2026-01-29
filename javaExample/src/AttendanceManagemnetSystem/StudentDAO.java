package AttendanceManagemnetSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO {

	String dbDrv = "com.mysql.cj.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:3306/Gumang13?serverTimezone=Asia/Seoul";
    String dbUsr = "gumang13";
    String dbPwd = "123456";
    

    
    // 등록
    public int setInsert(Student stud) {
        int result = 0;
        String sql = """
            insert into student
            (name, address, phone)
            values (?, ?, ?)
        """;
    
        try (
        	Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, stud.getStudentName());
            pstmt.setString(2, stud.getAddress());
            pstmt.setString(3, stud.getPhone());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

     //목록
    
    public List<Student> getSelectAll() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from student order by id desc";

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()) {
                Student stud = new Student();
                
                stud.setStudentName(rs.getString("name"));
                stud.setPhone(rs.getString("phone"));
                stud.setAddress(rs.getString("address"));
                
                list.add(stud);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    
    
    //  수정
    public int setUpdate(String targetName, Student stud) {
        int result = 0;
        String sql = "update student set name=?, address=?, phone=? where name=?";

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
        	pstmt.setString(1, stud.getStudentName() == null ? targetName : stud.getStudentName());
            pstmt.setString(2, stud.getAddress() == null ? "" : stud.getAddress());
            pstmt.setString(3, stud.getPhone() == null ? "" : stud.getPhone());
            pstmt.setString(4, targetName);

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    //삭제
    public int setDelete(String studentName) {
        int result = 0;
        String sql = "delete from student where name=?";

        try (
            Connection conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
            PreparedStatement pstmt = conn.prepareStatement(sql); ) {
        
            pstmt.setString(1, studentName);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    
    
    
    
    }

}