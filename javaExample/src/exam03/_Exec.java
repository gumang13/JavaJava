package exam03;

import java.util.ArrayList;

public class _Exec {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("List : "+list);
		list.add(1);
		System.out.println("List : "+list);
		list.add(2);
		System.out.println("List : "+list);
		list.add(300);
		System.out.println("List : "+list);

		
		System.out.println("리스트의 길이 : "+list.size());
		for(int i=0;i<list.size();i++)
			System.out.println("리스트의 "+i+"번째 인덱스의 값 : "+list.get(i));
	
	list.remove(2);
	for(int i=0;i<list.size();i++)
	      	System.out.println("리스트의 "+i+"번째 인덱스의 값 : "+list.get(i));
	
	list.set(0, 100);
	for(int i=0;i<list.size();i++)
		System.out.println("리스트의 "+i+"번째 인덱스의 값 : "+list.get(i));
	
	
	}

}
