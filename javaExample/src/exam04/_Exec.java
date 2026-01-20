package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동",12);
		Student s2 = new Student("철수",77);
		Student s3 = new Student("짱구",55);
		
		List<Student> list =new ArrayList<>();
		list.add(new Student("홍길동",12));
		list.add(new Student("철수",77));
		list.add(new Student("짱구",55));
		
		// 람다를 이용한 정렬 ( 점수 내림차순)
		
		

	}

}
