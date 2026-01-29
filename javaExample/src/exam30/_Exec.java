package exam30;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		     Scanner kbd=new Scanner(System.in);
		     int result=0;
		
		while(true) {
			System.out.println("선택 (1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료)");
			String menu = kbd.nextLine();
			StudentDTO dto= new StudentDTO();
			StudentDAO dao = new StudentDAO();
             switch(menu) {
             case "1":
            	 System.out.println("= = = 목록 = = =");
            	
            	 List<StudentDTO> list = dao.getSelectAll();
            	 System.out.printf("학번 \t 이름 \t 주민번호 \t 연락처 \t 주소 \t 등록일\n");
            	 System.out.printf("------------------------------------------------------------\n");
            	 for(int i=0;i<list.size();i++) {
            		 list.get(i).display();
            	 }
            	 break;
         
             case "2":
            	  
            	     dto.inputField("view");
            	    StudentDTO resultDTO = dao.getSelectOne(dto);
            	    resultDTO.display();
            	     
            	 break;
             case "3":    
           	     
           	     dto.inputField("chuga");
            	 
            	  result=dao.setInsert(dto);
            	 System.out.println("result : "+result);
            	 
            	 break;
             case "4":
            	
            	 dto.inputField("sujung");
            	
            	 break;
             case "5":
            	 dto.inputField("sakje");
            	result =dao.setDelete(dto);
            	 break;
             default : 
            	 System.out.println("= = = 프로그램 종료 = = =");
            	 return;
             }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		

	}  // 메인
}
