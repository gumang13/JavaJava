package exam27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedExampleEx {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(Arrays.asList("짱구","철수","유리"));
		List<Integer> intlist = new ArrayList<>();
		for(int i=0;i<=4;i++) {
		intlist.add(i);
		}
		
		System.out.print("정수 리스트 : ");
		UnboundedExample.printAll(intlist);
		System.out.print("문자열 리스트 : ");
      	UnboundedExample.printAll(strList);
        
      	
	}

}
