package std20260113;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBConnect {
    private Connection conn;     // 데이터베이스 연결 유지
    private Statement st;              // 데이터베이스에 쿼리문 전달 및 결과 받기
    private ResultSet rs;              // 데이터베이스의 결과를 저장
    
    
    public DBConnect() {
    	connect();
    }
    
    private void connect() {
    	// 데이터 베이스 접속
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	 String username="gumang13";
    	 String password = "123456";
    	 String url="jdbc:mysql://localhost:3306/gumang13";
    	 
    	 conn = DriverManager.getConnection(url,username,password);
    	}catch(Exception e) {
    		System.out.println("접속 실패!!!!");
    		e.printStackTrace();  // 오류 원인 출력
    	}
    	}
    
    // product 테이블의 데이터 가져오기
    public Product[] selectData() {
     Product[] products = new Product[6];
     // 쿼리문 작성하기
     String sql = "select * from product";   // product 테이블 모든 데이터 조회
     // 쿼리문 보내기
     try {
           st = conn.createStatement();     // Statement 생성
           rs = st.executeQuery(sql);          // 쿼리문 보내고 받은 결과를 resultSet에 저장
           
     }catch(Exception e) {
    	 System.out.println("쿼리문 실패");
     }
     // 결과 받기
     
     // 데이터들을 product 객체에 저장하기
      try {
    	  
    	  // 밑에줄이없을때까지
    	  int i=0;
     while(rs.next()) {
    	 //테이블의 컬럼명 쓰기
    	 Product temp = new Product(
    			 rs.getString("item_name"),rs.getInt("price"),
    			 rs.getInt("stock"),rs.getString("description")
    			 );
    			 products[i]=temp;
    	         i++;
    	 
     }
      }
     catch(Exception e) {
    	 System.out.println("객체 생성 실패");
     }
     
     return products;
    }
    
    
    
    
    
    
    
    
    
    
}
