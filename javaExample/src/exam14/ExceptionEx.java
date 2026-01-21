package exam14;

public class ExceptionEx {

	public static void main(String[] args) {
	        int[] numbers = {10,20,30};
	        
	        // null처리 , 공백처리 , 예외처리
	        try {
	        	System.out.println("---- 계산 시작 ----");
	        int result = numbers[0]/0;
	       
	        System.out.println("값 출력 : "+numbers[0]);
	        }catch(ArithmeticException e) {
	        	System.out.println("0으로 나눌 수 없("+e.getMessage()+")");
	        }catch(IndexOutOfBoundsException e) {
	        	System.out.println("존재하지 않는 인덱스");
	        }catch(Exception e) {
	        	System.out.println("알 수 없는 오류 발생");
	        }finally {
	        	System.out.println("--------무조건 실행 됨--------");
	        }
	}

}
