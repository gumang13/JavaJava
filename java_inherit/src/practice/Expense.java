package practice;

public class Expense extends Transaction{

	public Expense(int amount, String date, String memo) {
		super(amount, date, memo);
		
	}

	

	@Override
	public int money(int num) {
		System.out.println("["+num+"]원 지출 날짜 : ["+date+"] 메모: ["+memo+"]");
		tot=amount-num;
		return amount-num;
	}

}
