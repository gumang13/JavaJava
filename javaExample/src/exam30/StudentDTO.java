package exam30;

import java.sql.Date;
import java.util.Scanner;

public class StudentDTO {
	private int hakbun;
	private String name;
	private String ssn;
	private String phone;
	private String address;
	private Date createdDate;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public StudentDTO() {
		inputField();
	}
	// 메서드
	public void inputField() {
		Scanner kbd=new Scanner(System.in);
		System.out.println("이름");
		this.name=kbd.nextLine();
		System.out.println("주민등록번호");
		this.ssn=kbd.nextLine();
		System.out.println("전화번호");
		this.phone=kbd.nextLine();
		System.out.println("주소");
		this.address=kbd.nextLine();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
