package AttendanceManagemnetSystem;


import java.util.Scanner;

public class Student {

    
    private String studentName;
    private String address;
    private String phone;

    public Student() {}

   public void inputfield() {
	   Scanner sc = new Scanner(System.in);
	  
       System.out.print("이름 : ");
       this.studentName = sc.nextLine();   
       System.out.print("주소 : ");
       this.address = sc.nextLine();
       System.out.print("전화 : ");
       this.phone = sc.nextLine();
   }
    
   public void inputFieldsExceptName(Scanner sc) {
	   
	   System.out.print("새 이름 : ");
	    this.studentName = sc.nextLine();  
	    System.out.print("새 주소 : ");
	    this.address = sc.nextLine();
	    System.out.print("새 전화 : ");
	    this.phone = sc.nextLine();
   } 
   
  
   

   


	public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
