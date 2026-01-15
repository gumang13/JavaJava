package practice;

public class MinusAccount extends BankAccount{
//	3. 자식 클래스 2: MinusAccount (마이너스 통장)
//	BankAccount를 상속받음
//	추가 필드: long limit (마이너스 한도, 예: 1,000,000원)
//	메소드 구현:
//	withdraw(amount): (잔액 + 한도)가 출금액보다 크면 출금 가능.
//	예: 잔액이 0원이고 한도가 100만원일 때, 70만원 출금 시 잔액은 -70만원이 됨.
//	한도를 초과하면 "한도 초과" 출력 후 false 반환.
	private long limit;

public MinusAccount(String accountNumber, long balance, long limit) {
	super(accountNumber, balance);
	this.limit = limit;
}
      public boolean withdraw(long amount) {
    	  if(balance+limit+amount<0) {
    		  System.out.println("한도 초과");
    		  return false;
    		  
    	  }else {
    		  System.out.println("출금 성공 !! 잔여 한도 ["+(balance+limit-amount)+"]");
    		  balance=balance+limit-amount;
    		  return true;
    	  }
      }
	
	
	
	
	
	
}
