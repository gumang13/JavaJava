package practice;

public class Expense extends Transaction{

	public Expense(int amount, String date, String memo) {
		super(amount, date, memo);
		
	}

	@Override
	public void income(int num, String date, String memo) {
		
		
	}

	@Override
	public void expence(int num, String date, String memo) {
		amount= amount-num;
		System.out.println("["+num+"]원 지출 날짜 : ["+date+"] 메모: ["+memo+"]");
	}

}
