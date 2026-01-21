package exam15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 마트에 장보러감 물건담음 상품이름 q 찍으면 내가 고른 물건 + 합계금액 뜸 
		Scanner kbd = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		List<SellProduct> list2 = new ArrayList<>();
		Product pd1 = new Product("라면",1000);
		Product pd2 = new Product("옥수수",2000);
		Product pd3 = new Product("케첩",4500);
		Product pd4 = new Product("깻잎",2200);
		Product pd5 = new Product("사과",1400);
		list.add(pd1);
		list.add(pd2);
		list.add(pd3);
		list.add(pd4);
		list.add(pd5);
		
		
		while(true) {
		System.out.println("=======================");
		for(Product a : list) {
		System.out.println("상품명 : ["+a.getName()+"]"+"상품 가격 : ["+a.getPrice()+"]");
		}
		System.out.println("=======================");
		System.out.println("원하는 상품 이름을 입력해 주세요");
		String userinput= kbd.nextLine();
		
		if(userinput.toLowerCase().equals("q")) {
			break;
		}
		int countMoney=0;
		int countProduct=0;
		
		for(Product a : list) {
			if(userinput.equals(a.getName())) {
				countMoney+= a.getPrice();
				SellProduct s = new SellProduct(a.getName(),a.getPrice());
				list2.add(s);
				
			}
			}
	       
        
		}
		 for(SellProduct a : list2)
		  System.out.println("구매한 상품 : ["+a.getName()+"] 가격 : ["+a.getPrice()+"]");
		
		
		
		
		
		
	}

}
