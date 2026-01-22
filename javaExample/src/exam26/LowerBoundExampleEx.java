package exam26;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundExampleEx {

	public static void main(String[] args) {
		List<Number> numList = new ArrayList<>();
		LowerBoundExample.addIntegers(numList);
		System.out.println("추가된 데이터 : "+numList);

	}

}
