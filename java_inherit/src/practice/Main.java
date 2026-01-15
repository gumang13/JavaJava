package practice;

public class Main {

	public static void main(String[] args) {          

//		4. 실행 클래스: BankMain
//		SavingsAccount(초기 잔액 5000원)와 MinusAccount(초기 잔액 0원, 한도 100만원) 객체를 각각 생성하세요.
//		부모 타입 배열 BankAccount[] accounts에 두 객체를 담으세요.
//		반복문을 돌며 각 계좌에서 7,000원을 출금 시도하세요.
//		출금 결과(true/false)에 따라 "출금 성공" 또는 "출금 실패"를 출력하고 마지막에 각 계좌의 printBalance()를 호출하세요.
//		✅ 이번 문제의 핵심 포인트
//		로직의 차별화: 똑같은 withdraw 메소드지만, 자식 클래스에 따라 '출금 가능 여부'를 판단하는 공식이 달라지는 것을 코드로 구현해야 합니다.
//		부울(boolean) 반환: 메소드의 실행 결과에 따라 성공/실패를 호출한 쪽에 알리는 방식을 익힙니다.
//		상태 유지: 출금이 성공했을 때만 실제 balance 필드 값이 변경되도록 주의하세요.
//		직접 작성해 보시고, MinusAccount에서 마이너스 잔액이 계산되는 수식이 헷갈린다면 언제든 질문해 주세요! 자바의 조건문과 상속의 결합은 TCP School - 클래스의 상속 자료를 참고하시면 개념 정리에 도움이 됩니다.
//	   
		SavingsAccount sa = new SavingsAccount("123456",5000);
		MinusAccount ma = new MinusAccount("456789",0,1000000);
		 

			
			sa.withdraw(7000);
			sa.printBalance();
			ma.withdraw(7000);
			ma.printBalance();
		
		
		
		
	}

}
