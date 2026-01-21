package exam11;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	     // set - =__= 중복을 허용하지 않는
     
		Set<String> set = new HashSet<>();
		System.out.println("set : "+set);
		set.add("사과");
		System.out.println("set : "+set);
		set.add("바나나");
		System.out.println("set : "+set);
		set.add("포도");
		System.out.println("set : "+set);
		set.add("사과");
		System.out.println("set : "+set.size());
		
		if(set.contains("사과")) {
			System.out.println("사과가 있습ㄴ이다");
		}
		for(String a : set) {
			System.out.println(a);
		}
		set.remove("체리");
		System.out.println(set);
		
		if(set.contains("체리")) {
			set.remove("체리");
			set.add("cherry");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
