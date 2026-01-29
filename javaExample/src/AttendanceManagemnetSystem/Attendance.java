package AttendanceManagemnetSystem;

import java.sql.Date;

public class Attendance {
       private int student_id =0;
       private int course_id =0;
       private long attendence=0;
       private Date createdDate;
       
       
       
       
       
	   public Attendance() {
		super();
	   }
	   public int getStudent_id() {
		   return student_id;
	   }
	   public void setStudent_id(int student_id) {
		   this.student_id = student_id;
	   }
	   public int getCourse_id() {
		   return course_id;
	   }
	   public void setCourse_id(int course_id) {
		   this.course_id = course_id;
	   }
	   public long getAttendence() {
		   return attendence;
	   }
	   public void setAttendence(long attendence) {
		   this.attendence = attendence;
	   }
	   public Date getCreatedDate() {
		   return createdDate;
	   }
	   public void setCreatedDate(Date createdDate) {
		   this.createdDate = createdDate;
	   }
       

       
	

}
