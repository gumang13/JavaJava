package practice;

public class Transfer extends Transaction{

	public Transfer(int amount, String date, String memo) {
		super(amount, date, memo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void income(int num, String date, String memo) {
			
	}

	@Override
	public void expence(int num, String date, String memo) {
		
		
	}
	public void deposit(int num, String date, String memo) {
		amount= amount+num;
		System.out.println("["+num+"]원 입금 날짜 : ["+date+"] 메모: ["+memo+"]");
	}
	public void transfer(int num, String date, String memo) {
	    amount=amount-num;
	    System.out.println("["+num+"]원 이체 날짜 : ["+date+"] 메모: ["+memo+"]");
	}
}
