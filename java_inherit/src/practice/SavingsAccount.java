package practice;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountNumber, long balance) {
		super(accountNumber, balance);
	}
	@Override
	public boolean  withdraw(long amount) {
		 if(balance<amount) {
			 System.out.println("잔액이 부족합니다");
		return false;
	}else {
		System.out.println("출금 성공!! 현재 잔액 : ["+(balance+amount)+"]원");
		balance-=amount;
		return true;
	}
		
		
	}

	
	
//	2. 자식 클래스 1: SavingsAccount (자유적금 계좌)
//	BankAccount를 상속받음
//	특징: 일반 계좌와 같지만, 잔액보다 큰 금액은 출금할 수 없음.
//	메소드 구현:
//	withdraw(amount): 잔액이 충분하면 차감 후 true 반환, 부족하면 "잔액 부족" 출력 후 false 반환.
	

}
