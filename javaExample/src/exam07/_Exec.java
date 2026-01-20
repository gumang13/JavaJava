package exam07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		List<Student> list = new ArrayList<>();    // 
		
		while(true) {
		System.out.println("이름 : ");
        String name = kbd.nextLine();
        
        
        if(name.toLowerCase().equals("q"))
        	break;
        
 		System.out.println("국어 : ");
 		String kor_ = kbd.nextLine();
 		
		System.out.println("영어 : ");
		String eng_ = kbd.nextLine();
		
		System.out.println("수학 : ");
		String mat_ = kbd.nextLine();
		
	    int kor=Integer.parseInt(kor_);
	    int	eng=Integer.parseInt(eng_);
	    int	mat=Integer.parseInt(mat_);
	   
		
		 Student student =new Student(name,kor,eng,mat);
		student.total();
		student.getAvg();

              list.add(student);	
		}
	
		for(int i=0;i<list.size();i++) {
			list.get(i).display();
		}
	}

}
