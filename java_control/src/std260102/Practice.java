package std260102;

class bike{
    String whill;
    public bike(String whill, String handle) {
		super();
		this.whill = whill;
		this.handle = handle;
	}
	String handle;
	public void Honk{
		System.out.println("따르릉");
	}
	
	
	
}

public class Practice {
	 
	 
		  void Cloks() {
			 System.out.println("honk honk!");
		 }
	 
	 private static int hap(int n1, int n2) {
			// 정수2개를 더해서 그 결과를 반환
			int sum = n1+n2;
			
			return sum;
		}
	 
	 private static void volumeup() {
		 
		 System.out.println("볼륨을 키워주세요");
	 }
	
public static void main(String[] args) {
	
	bike bike = new bike("바퀴","핸들");
	 
	volumeup();
	int i = 2151 ; 
	int k = 985616;
	int sum=hap(i, k);
	System.out.println(sum);
}
}


