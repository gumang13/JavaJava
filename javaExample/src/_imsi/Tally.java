package _imsi;

import java.sql.Date;
import java.util.Scanner;

public class Tally {
	// attendance 출 absence 결 tardiness 지 leaveEarly 조퇴 outing 외출
	
	Scanner sc = new Scanner(System.in);
	
	private int id;
	private String student_id;
	private String course_id;
	private Date attendance_date;
	
	private long attendance_code;
	private int attendance; // 출석
	private int tardiness; // 지각 1000
	private int leaveEarly; // 죄퇴 100000
	private int outing; // 외출 10000000
	private int absence; // 결석 1000000000
	private int stuId;
	private int attendanceRate;
	
	
	public void inputStudentId() {
		System.out.println("학번을 입력해주세요 : ");
		String stuId_ = sc.nextLine();
		this.stuId = Integer.parseInt(stuId_);
	}
	
	public void calculate() {
		this.attendance = (int) (attendance_code%1000);
		this.tardiness = (int) ((attendance_code%100000)/1000);
		this.leaveEarly = (int) ((attendance_code%10000000)/100000);
		this.outing = (int) ((attendance_code%1000000000)/10000000);
		this.absence = (int) (attendance_code/1000000000);
		this.attendanceRate = (attendance / (attendance+absence))*100;
	}
	
	
	
	public void attendanceList() {
		System.out.println("출석 : "+attendance+", 지각 :"+tardiness+", 조퇴 : "+leaveEarly+", 외출 : "
				+outing+", 결석 : "+absence);
		System.out.println("출석률 : "+attendanceRate);
	}

	public long getAttendance_code() {
		return attendance_code;
	}

	public void setAttendance_code(long attendance_code) {
		this.attendance_code = attendance_code;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getTardiness() {
		return tardiness;
	}

	public void setTardiness(int tardiness) {
		this.tardiness = tardiness;
	}

	public int getLeaveEarly() {
		return leaveEarly;
	}

	public void setLeaveEarly(int leaveEarly) {
		this.leaveEarly = leaveEarly;
	}

	public int getOuting() {
		return outing;
	}

	public void setOuting(int outing) {
		this.outing = outing;
	}

	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public Date getAttendance_date() {
		return attendance_date;
	}

	public void setAttendance_date(Date attendance_date) {
		this.attendance_date = attendance_date;
	}

	

	
	
	
	
	
	
	
}
