package AttendanceManagemnetSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _main {

	public static void main(String[] args) {
		ArrayList<StudentDTO> studnet=new ArrayList<>();
	Scanner kbd= new Scanner(System.in);
	ConnectDB connectDB= new ConnectDB();
	 StudentDAO dao = new StudentDAO();
	while(true) {
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1.학생관리  2. 출결관리 0.종료");
		String input = kbd.nextLine();
		
		if(input.equals("1")) {
//-학생관리---------------------------------------------------------------------------------------------	
			
			while(true) {
				
				System.out.println("학생관리");
		        System.out.println("메뉴를 선택해 주세요 ");
		        System.out.println("1.학생등록 2.학생목록 3.정보수정 4.정보삭제 0. 프로그램 종료");
		        String input2 = kbd.nextLine();
		        if (input2.equals("1")) {
		        	System.out.println("학생등록");
		        	Student stud = new Student(); 
	                stud.inputfield();             
	                System.out.println("등록 결과 : " + dao.setInsert(stud));
		        	
		        }
		        else if (input2.equals("2")) {
		        	System.out.println("학생조회");
		        	 List<Student> list = dao.getSelectAll();
		                for (Student s : list) {
		                    System.out.println(
		                        s.getStudentName() + " | " + s.getPhone() + " | " + s.getAddress()
		                    );
		        	
		        }
		        }else if (input2.equals("3")) {
		        	System.out.println("학생정보수정");
		        	System.out.print("정보 수정할 이름 : ");
	                String targetName = kbd.nextLine();
	                Student updateStudent = new Student();
	                updateStudent.inputFieldsExceptName(kbd);
	                System.out.println("수정 결과 : " + dao.setUpdate(targetName, updateStudent));


		        }
		        else if (input2.equals("4")) {
		        	System.out.println("학생정보삭제");
		        	   System.out.print("삭제할 학생(정보)이름 : ");
		                String name = kbd.nextLine();
		                System.out.println("삭제 결과 : " + dao.setDelete(name));
		            
		        	
		        }
		        
		        else if (input2.equals("0")) {
		        	System.out.println("학생 관리 프로그램을 종료합니다");	        	
		        	break;
		        }
		        else {
		        	System.out.println("다시 입력해 주세요");
		        }
				
				
				
				
				
				
				
				
				
				}			
//-----------------------------------------------------------------------------------------------------------			
		}
		else if(input.equals("2")) {
//-출결관리-----------------------------------------------------------------------------------------	
			while(true) {
				//입력받는것  - 학생이름 과목
		
			
	        System.out.println("메뉴를 선택해 주세요 ");
	        System.out.println("1.출결입력 2.출결 조회 3.정보 수정 4.정보 삭제 0. 프로그램 종료");
	        String input2 = kbd.nextLine();
	        if (input2.equals("1")) {
	        	connectDB.attendance();
	        	
	        }
	        else if (input2.equals("2")) {
	        	System.out.println("출결조회");
	        	connectDB.viewAttendance();
	        	
	        }
	        else if (input2.equals("3")) {
	        	System.out.println("정보수정");
	        	

	        }
	        else if (input2.equals("4")) {
	        	System.out.println("정보삭제");
	        	
	        }
	        else if (input2.equals("0")) {
	        	System.out.println("출결 프로그램을 종료합니다");
	        	break;
	        }
	        else {
	        	System.out.println("다시 입력해 주세요");
	        }
			
			
			
			
			
			
			
			
			
			}
//------------------------------------------------------------------------------------------------
		}
	    else if(input.equals("0")) {
	    	System.out.println("프로그램을 종료합니다");
	    	break;	
	    }
	    else {
	    	System.out.println("다시 입력해 주세요");
	    }
	    	
			
	}
		
		
	}

}
