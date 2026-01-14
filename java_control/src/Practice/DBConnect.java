package Practice;

import java.sql.*;

import std20260114.GameMember;

public class DBConnect {
      private Connection conn;
      private Statement st;
      private ResultSet rs;
      
      public DBConnect() {
    	  connect();
      }
      
      private void connect() {
    	  try {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  String id = "gumang13";
    		  String pw = "123456";
    		  String url= "jdbc:mysql://localhost:3306/gumang13";
    		  
    		  conn = DriverManager.getConnection(url,id,pw);
    	  }catch(Exception e) {
    		  System.out.println("오류발생 !! 접속불가");
    		  e.printStackTrace();
    	  }
      }
      
      public Item[] itemList() {
  		Item[] items = new Item[10];
  		
  		// 쿼리문 작성하기
  		// 쿼리문 보내기
  		// 결과 받기
  		// 데이터를 클래스 객체에 저장하고 배열에 저장하기
  		
  		String sql="select * from item";
  		
  		try {
  			st=conn.createStatement();
  			rs=st.executeQuery(sql);
  			
  			int i =0;
  			while(rs.next()) {
  				Item data = new Item(rs.getString("item_name"),
  						rs.getInt("item_price"),rs.getString("item_main_image"),
  						rs.getInt("item_stock"));
  			
  			    items[i] = data;
  			    i++;
  			}
  		}catch(Exception e){
  			System.out.println("질의 실패 및 객체생성 실패");
  		}
  		
  		return items;
  	}
      
    
      
}
