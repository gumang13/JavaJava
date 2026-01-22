package exam23;

public class GenericEx {

	public static void main(String[] args) {
		       Box<String> stringBox = new Box<>();
		       stringBox.set("Hello Java");
		       String str=stringBox.get();
		       System.out.println(str);
		
	          Box<Integer> intBox = new Box<>();	
		      intBox.set(123);
		      int num = intBox.get();
		      System.out.println(num);
		      
		      stringBox.set(123);
		
		
		
		
		
		
		

	}

}
