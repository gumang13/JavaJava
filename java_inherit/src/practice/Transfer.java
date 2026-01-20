package practice;

public class Transfer extends Transaction{

	public Transfer(int amount, String date, String memo) {
		super(amount, date, memo);
		
	}

	

	
	public int money(int num) {
		System.out.println("["+num+"]원 입금 날짜 : ["+date+"] 메모: ["+memo+"]");
		tot=amount+num;
		return amount+num;
	}




	
}
