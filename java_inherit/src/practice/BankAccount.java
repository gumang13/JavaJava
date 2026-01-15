package practice;

public abstract class BankAccount {
//	1. 부모 클래스: BankAccount (추상 클래스)
//	필드: String accountNumber(계좌번호), long balance(잔액)
//	생성자: 계좌번호와 초기 잔액을 받아 설정
//	일반 메소드:
//	void deposit(long amount): 입금 로직 (금액만큼 잔액 증가)
//	void printBalance(): "계좌 [번호]의 현재 잔액: [잔액]원" 출력
//	추상 메소드: abstract boolean withdraw(long amount)
//	(설명: 출금 성공 시 true, 실패 시 false를 반환하도록 자식들이 구현)
	protected String accountNumber;
	protected long balance;
	
	public BankAccount(String accountNumber, long balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance+=amount;
	}
	public void printBalance() {
		System.out.println("계좌 ["+accountNumber+"]의 현재 잔액 : ["+balance+"]원");
	}
	
	abstract boolean withdraw(long amount);
		
	
	
	
	
}
