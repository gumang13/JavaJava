package practice;

public abstract class Transaction {
	  protected int amount;
	  protected String date;
	  protected String memo;
	  
	  public Transaction(int amount, String date, String memo) {
		super();
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	  }
	  public abstract void income(int num, String date, String memo);
	  public abstract void expence(int num, String date, String memo);
	  
	  public void showAmount() {
		  System.out.println(amount);
	  }
	
	  

}
