package exam23;

public class Calculator<T extends Number> {              //넘버클래스를 상속받는 자식들만 올수있음
	
	public double doubleValue(T number) {
		return number.doubleValue();
	}

}
