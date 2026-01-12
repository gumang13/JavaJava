package std20260112;

public class MainMethod {

	public static void main(String[] args) {
		Student student = new Student();
		student.name="맹구";
		student.age="5";
		
		System.out.println(student);
		Student student2 = new Student("짱구","5",100);
		Student student3 = new Student("철수",100,90);
		System.out.println(student3);
      BingoGame bingoGame = new BingoGame();
      
      bingoGame.setName("짱구");
     
    	System.out.println(bingoGame.getName()); 
      
	}

}
