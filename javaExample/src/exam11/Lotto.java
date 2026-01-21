package exam11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
	      Set<Integer> lotto = new HashSet<>();
	      Random random = new Random();
	      while(lotto.size()<6) {
	    	  lotto.add(random.nextInt(45)+1);
	      }
           System.out.println("이번주 로또 번호 : "+lotto);
	}

}
