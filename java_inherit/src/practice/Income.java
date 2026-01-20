package practice;

public class Income extends Transaction{

	public Income(int amount, String date, String memo) {
		super(amount, date, memo);
		
	}

	

	@Override
	public int money(int num) {
		tot=amount+num;
		return amount+num;
	}

}
