package AttendanceManagemnetSystem;
import java.util.List;
import java.util.Scanner;

public class StudentProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("[1.등록] [2.목록] [3.수정] [4.삭제] [0.종료]");
            String num = sc.nextLine();

            if (num.equals("0")) {
                System.out.println("프로그램 종료");
                break;

                //등록
            } else if (num.equals("1")) {
            	Student stud = new Student(); 
                stud.inputfield();             
                System.out.println("등록 결과 : " + dao.setInsert(stud));
            
                
                
            } else if (num.equals("2")) {
                List<Student> list = dao.getSelectAll();
                for (Student s : list) {
                    System.out.println(
                        s.getStudentName() + " | " + s.getPhone() + " | " + s.getAddress()
                    );
                }

                
            } else if (num.equals("3")) {
            	System.out.print("정보 수정할 이름 : ");
                String targetName = sc.nextLine();
                Student updateStudent = new Student();
                updateStudent.inputFieldsExceptName(sc);
                System.out.println("수정 결과 : " + dao.setUpdate(targetName, updateStudent));

                

            } else if (num.equals("4")) {
                System.out.print("삭제할 학생(정보)이름 : ");
                String name = sc.nextLine();
                System.out.println("삭제 결과 : " + dao.setDelete(name));
            }
        }

        
        
        
        
    }
}
