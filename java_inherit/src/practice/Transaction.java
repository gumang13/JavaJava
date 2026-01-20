package practice;

public abstract class Transaction {
	  protected int amount;
	  protected String date;
	  protected String memo;
      protected int tot;	  
	  public Transaction(int amount, String date, String memo) {
		super();
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	  }
	  public abstract int money(int num);
	  
	  public void showAmount() {
		  System.out.println(tot);
	  }
	
	  

}
